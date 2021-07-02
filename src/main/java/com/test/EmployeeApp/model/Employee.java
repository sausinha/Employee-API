package com.test.EmployeeApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private int id;
    private String salary;
    private String name;
    private String address;
    private String department;
    private String email;
    private int age;
}
