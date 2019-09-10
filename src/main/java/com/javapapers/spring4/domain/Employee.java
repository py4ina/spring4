package com.javapapers.spring4.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    private int id;
    private String name;
    private double sal;
}
