package com.example.employee.entity;

/*
 * 实体Employee包含字段分别有：id, 姓名(name), 年龄(age), 性别(gender), companyId, 薪资(salary)
 * 实体Company包含字段分别有：id, 公司名(companyName), 员工数量(employeesNumber)
 */

import javax.persistence.Id;

public class Company {
    @Id
    private int id;
    private String companyName;
    private int employeesNumber;

    public Company() {}

    public Company(int id, String companyName, int employeesNumber) {
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
