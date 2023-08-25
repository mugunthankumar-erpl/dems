/**
 *
 */
package com.erplogic.dems.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erplogic.dems.common.dao.AbstractEntityDao;
import com.erplogic.dems.common.repository.RepositoryCommon;
import com.erplogic.dems.entities.MEmployee;

/**
 * @author Admin
 *
 */
@Repository
public class EmployeeDAO extends AbstractEntityDao<MEmployee, Integer> {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    protected RepositoryCommon<MEmployee, Integer> getRepsitoryDAO() {

        return employeeRepository;
    }

    @Override
    public Class<MEmployee> getEntityClass() {
        // TODO Auto-generated method stub
        return MEmployee.class;
    }

}
