/**
 *
 */
package com.erplogic.dems.employee;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erplogic.dems.common.dao.AbstractEntityDao;
import com.erplogic.dems.common.service.AbstractEntityService;
import com.erplogic.dems.entities.MEmployee;
import com.erplogic.dems.response.structure.Errors;
import com.erplogic.dems.utilities.Operation;

/**
 * @author Admin
 *
 */
@Service
public class EmployeeService extends AbstractEntityService<MEmployee, Integer> {

    @Autowired
    private EmployeeDAO dao;

    @Override
    public Errors validate(final MEmployee o, final Operation opr, final Map<String, String> params) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected AbstractEntityDao<MEmployee, Integer> getDAO() {

        return dao;
    }

}
