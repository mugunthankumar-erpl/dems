package com.erplogic.sap;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.erplogic.sap.apis.expense.ExpenseWebService;
import com.erplogic.sap.expense.wsdl2java.StandardFaultMessageException;

@SpringBootApplication
public class ErplogicHrmsApplication {

    public static void main(final String[] args) throws StandardFaultMessageException, DatatypeConfigurationException {
        SpringApplication.run(ErplogicHrmsApplication.class, args);
        final ExpenseWebService expense = new ExpenseWebService();
        expense.createResponse();
    }
}
