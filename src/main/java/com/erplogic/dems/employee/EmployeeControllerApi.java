package com.erplogic.dems.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erplogic.dems.common.api.AbstractController;
import com.erplogic.dems.common.service.AbstractEntityService;
import com.erplogic.dems.entities.MEmployee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeControllerApi extends AbstractController<MEmployee, Integer> {
    @Autowired
    EmployeeService s;

    @Override
    protected AbstractEntityService<MEmployee, Integer> getService() {

        return s;
    }

}
