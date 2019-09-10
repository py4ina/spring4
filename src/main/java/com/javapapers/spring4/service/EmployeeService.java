package com.javapapers.spring4.service;

import com.javapapers.spring4.dao.EmployeeDAO;
import com.javapapers.spring4.domain.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getEmployeeDetails(){
        return employeeDAO.getEmployeeDetails();
    }
}
