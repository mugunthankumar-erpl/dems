package com.erplogic.sap;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.erplogic.sap.apis.expense.ExpenseWebService;
import com.erplogic.sap.expense.wsdl2java.StandardFaultMessageException;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(ErplogicHrmsApplication.class);
    }

    public void run() throws StandardFaultMessageException, DatatypeConfigurationException {
        final ExpenseWebService expense = new ExpenseWebService();
        expense.createResponse();
    }
}
