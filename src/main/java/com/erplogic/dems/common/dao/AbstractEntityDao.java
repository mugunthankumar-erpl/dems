/**
 *
 */
package com.erplogic.dems.common.dao;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.erplogic.dems.common.entities.AbstractEntityWithAudit;
import com.erplogic.dems.common.repository.RepositoryCommon;

/**
 * @author Admin
 *
 */

public abstract class AbstractEntityDao<T, K> {
    public abstract Class<T> getEntityClass();

    protected abstract RepositoryCommon<T, K> getRepsitoryDAO();

    public Page<T> getAll(final Specification<T> s, final Pageable p) {

        return getRepsitoryDAO().findAll(s, p);

    }

    public Page<T> getAll(final Pageable p) {

        return getRepsitoryDAO().findAll(p);

    }

    public Optional<T> getOne(final K key) {

        return getRepsitoryDAO().findById(key);
    }

    public String delete(final K key) {
        getRepsitoryDAO().deleteById(key);
        return "Deleted Success fully";
    }

    public T create(final T o) {
        if (o instanceof AbstractEntityWithAudit) {
            final AbstractEntityWithAudit oa = (AbstractEntityWithAudit) o;
            oa.setCreatedBy("SYSTEM");
            oa.setCreatedOn(LocalDateTime.now());
            oa.setModifiedBy("SYSTEM");
            oa.setModifiedOn(LocalDateTime.now());
        }
        preCreate(o);
        final T result = getRepsitoryDAO().save(o);
        postCreate(result);
        return result;
    }

    public T update(final T o) {
        if (o instanceof AbstractEntityWithAudit) {
            final AbstractEntityWithAudit oa = (AbstractEntityWithAudit) o;
            oa.setModifiedBy("SYSTEM");
            oa.setModifiedOn(LocalDateTime.now());
        }
        preUpdate(o);
        final T result = getRepsitoryDAO().save(o);
        postUpdate(result);
        return result;
    }

    public void preCreate(final T o) {
    }

    public void postCreate(final T o) {
    }

    public void preUpdate(final T o) {
    }

    public void postUpdate(final T o) {
    }

}
