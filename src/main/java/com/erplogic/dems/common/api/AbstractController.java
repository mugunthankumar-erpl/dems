/**
 *
 */
package com.erplogic.dems.common.api;

import com.erplogic.dems.common.service.AbstractEntityService;
import com.erplogic.dems.response.structure.Errors;
import com.erplogic.dems.response.structure.MetaData;
import com.erplogic.dems.response.structure.PaginationMeta;
import com.erplogic.dems.utilities.Constants;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Admin
 *
 */

@CrossOrigin
public abstract class AbstractController<T, K> extends AbstractAPI {

    protected abstract AbstractEntityService<T, K> getService();

    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET})
    public ResponseEntity<Object> getAll(@RequestParam(required = false) final Map<String, String> filters,
        @RequestParam(required = false) final String searchTerms,
        @RequestParam(required = false) final String sortField, @RequestParam(required = false) final String sortOrder,
        final Pageable pageable) {

        final Page<T> p = getService().getAll(filters, searchTerms, sortField, sortOrder, pageable);
        final MetaData metaData = new MetaData();
        metaData.setPaginationMeta(PaginationMeta.createPagination(p));
        return ok(p.getContent(), metaData);

    }

    @GetMapping("/{key}")
    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET})
    public ResponseEntity<Object> getOne(@PathVariable("key") final K key) {

        final Optional<T> o = getService().getOne(key);

        if (o.isEmpty()) {
            return badRequest(Errors.of(Constants.ERROR_DATA_NOT_AVAILABE));
        }

        return ok(o.get());
    }

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.POST})
    public ResponseEntity<Object> create(@RequestBody final T o) {

        final T res = getService().create(o);
        return ok(res);
    }

    @PutMapping("/{key}")
    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.PUT})
    public ResponseEntity<Object> update(@PathVariable("key") final K key, @RequestBody final T o) {
        final T res = getService().update(key, o);

        return ok(res);
    }

    @DeleteMapping("/{key}")
    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.DELETE})
    public ResponseEntity<Object> deleteEmployeeDetails(@PathVariable("key") final K key) {

        final Optional<T> o = getService().getOne(key);

        if (o.isEmpty()) {
            return badRequest(Errors.of(Constants.ERROR_DATA_NOT_AVAILABE));
        }

        final String s = getService().delete(key);

        return ok(s);
    }

}
