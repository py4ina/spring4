package com.javapapers.spring4.util;

import com.javapapers.spring4.domain.Employee;

import java.util.List;

public interface DataSource {
    List<Employee> getEmployeeDetails();
}
