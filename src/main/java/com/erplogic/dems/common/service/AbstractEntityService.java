/**
 *
 */
package com.erplogic.dems.common.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.erplogic.dems.common.dao.AbstractEntityDao;
import com.erplogic.dems.exceptions.BadRequestException;
import com.erplogic.dems.response.structure.Errors;
import com.erplogic.dems.utilities.Operation;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;

/**
 * @author Admin
 *
 */
public abstract class AbstractEntityService<T, K> {
    protected abstract AbstractEntityDao<T, K> getDAO();

    public abstract Errors validate(T o, Operation opr, Map<String, String> params);

    public Page<T> getAll(final Map<String, String> filters, final String searchTerm, final String sortField,
        final String sortOrder, final Pageable p) {

        final Specification<T> s = buildSpecification(filters, searchTerm, sortField, sortOrder,
            getDAO().getEntityClass());

        return getDAO().getAll(s, p);

    }

    public Optional<T> getOne(final K key) {
        return getDAO().getOne(key);
    }

    public String delete(final K key) {

        return getDAO().delete(key);
    }

    public T create(final T o) {
        final Errors errs = validate(o, Operation.CREATE, null);
        if (Errors.is(errs)) {
            throw new BadRequestException(BadRequestException.BAD_REQUEST, errs);
        }

        return getDAO().create(o);
    }

    public T update(final K key, final T o) {
        final Errors errs = validate(o, Operation.UPDATE, null);
        if (Errors.is(errs)) {
            throw new BadRequestException(BadRequestException.BAD_REQUEST, errs);
        }

        return getDAO().update(o);
    }

    public static <T> Specification<T> buildSpecification(final Map<String, String> filters, final String searchTerm,
        final String sortField, final String sortOrder, final Class<T> entityClass) {
        return new Specification<T>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            @Override
            public Predicate toPredicate(final Root<T> root, final CriteriaQuery<?> query, final CriteriaBuilder cb) {
                final List<Predicate> predicates = new ArrayList<>();

                final EntityType<T> entityType = root.getModel();

                if (sortField != null && !sortField.isEmpty()) {
                    final Path<?> path = root.get(sortField);
                    final Order order = "asc".equalsIgnoreCase(sortOrder) ? cb.asc(path) : cb.desc(path);
                    query.orderBy(order);
                }

                if (searchTerm != null && !searchTerm.isEmpty()) {
                    for (final SingularAttribute<? super T, ?> attribute : entityType.getSingularAttributes()) {
                        final Path<String> path = root.get(attribute.getName());
                        if (attribute.getJavaType().equals(String.class)) {

                            predicates.add(cb.like(cb.lower(path), "%" + searchTerm.toLowerCase() + "%"));
                        } else if (path.getJavaType().equals(Integer.class) || path.getJavaType().equals(Long.class)
                            || path.getJavaType().equals(Double.class) || path.getJavaType().equals(Float.class)) {
                            // Handle numeric columns
                            try {
                                final Number searchNumber = Double.parseDouble(searchTerm);
                                predicates.add(cb.equal(path, searchNumber));
                            } catch (final NumberFormatException e) {
                                // Ignore parsing errors
                            }
                        }
                    }
                }

                if (!predicates.isEmpty()) {
                    return cb.or(predicates.toArray(new Predicate[0]));
                }
                if (!filters.isEmpty()) {
                    for (final Map.Entry<String, String> entry : filters.entrySet()) {
                        final String fieldName = entry.getKey();
                        final String filterValue = entry.getValue();
                        if ("sortField".equalsIgnoreCase(fieldName) || "sortOrder".equalsIgnoreCase(fieldName)
                            || "page-number".equalsIgnoreCase(fieldName) || "page-size".equalsIgnoreCase(fieldName)) {
                            continue;
                        }
                        final Path<String> path = root.get(fieldName);
                        if (path != null) {

                            if (path.getJavaType().equals(String.class)) {
                                predicates.add(cb.like(path.as(String.class), "%" + filterValue + "%"));
                            } else if (path.getJavaType().equals(Integer.class) || path.getJavaType().equals(Long.class)
                                || path.getJavaType().equals(Double.class) || path.getJavaType().equals(Float.class)) {
                                try {
                                    final Number searchNumber = Double.parseDouble(filterValue);
                                    predicates.add(cb.equal(path, searchNumber));
                                } catch (final NumberFormatException e) {
                                    // Ignore parsing errors
                                }
                            }
                        }
                    }
                }

                if (predicates.isEmpty()) {
                    return cb.and(); // Match all records
                }

                return cb.and(predicates.toArray(new Predicate[0]));
            }

        };
    }
}
