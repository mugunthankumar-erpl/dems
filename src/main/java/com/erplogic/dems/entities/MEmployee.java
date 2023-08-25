package com.erplogic.dems.entities;

import com.erplogic.dems.common.entities.AbstractEntityWithAudit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The persistent class for the m_employee database table.
 *
 */
@Entity
@Table(name = "m_employee")
public class MEmployee extends AbstractEntityWithAudit {

    public static final String COLOUMN_EMP_ID = "empId";
    public static final String COLOUMN_EMP_NAME = "empName";
    public static final String COLOUMN_EMP_PWD = "empPwd";
    public static final String COLOUMN_EMP_TYPE = "empType";
    public static final String COLOUMN_DEPT_ID = "deptId";
    public static final String COLOUMN_DESIGNATION_ID = "designationId";
    public static final String COLOUMN_STATUS = "status";

    @Id
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "dept_id")
    private int deptId;

    @Column(name = "designation_id")
    private int designationId;

    private String email;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_pwd")
    private String empPwd;

    @Column(name = "emp_type")
    private int empType;

    @Column(name = "mobile_no")
    private String mobileNo;

    private String status;

    public MEmployee() {
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(final int empId) {
        this.empId = empId;
    }

    public int getDeptId() {
        return this.deptId;
    }

    public void setDeptId(final int deptId) {
        this.deptId = deptId;
    }

    public int getDesignationId() {
        return this.designationId;
    }

    public void setDesignationId(final int designationId) {
        this.designationId = designationId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(final String empName) {
        this.empName = empName;
    }

    public void setEmpPwd(final String empPwd) {
        this.empPwd = empPwd;
    }

    public int getEmpType() {
        return this.empType;
    }

    public void setEmpType(final int empType) {
        this.empType = empType;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(final String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

}
