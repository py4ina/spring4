package com.javapapers.spring4.dao;

import com.javapapers.spring4.domain.Employee;
import com.javapapers.spring4.util.DataSource;

import java.util.List;

public class EmployeeDAO {
    private DataSource dataSource;

    public EmployeeDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Employee> getEmployeeDetails() {
        return dataSource.getEmployeeDetails();
    }
}
