package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * 实体Employee包含字段分别有：id, 姓名(name), 年龄(age), 性别(gender), companyId, 薪资(salary)
 * 实体Company包含字段分别有：id, 公司名(companyName), 员工数量(employeesNumber)
 */
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private int age;
    private String gender;
    private int companyId;
    private int salary;

    public Employee() {}

    public Employee(int id, String name, int age, String gender, int companyId, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
