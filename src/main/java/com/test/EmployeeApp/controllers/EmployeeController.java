package com.test.EmployeeApp.controllers;

import com.test.EmployeeApp.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping(value = "/app")
public class EmployeeController {

    @GetMapping(value = "employee-list", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> allEmployees() {
        List<Employee> employeeList;
        employeeList = IntStream.rangeClosed(1, 100000).boxed().map(i -> {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName("Emp"+i);
            employee.setEmail("emp" + i + "@gmail.com");
            employee.setAddress("TestEmployee" + i);
            employee.setDepartment("TestDept" + i);
            employee.setSalary("100"+i);
            employee.setAge(32);
            return employee;
        }).collect(Collectors.toList());
        return employeeList;

    }

    @GetMapping(value = "status-check")
    public String statusCheck(){
        return "Service is UP";
    }
}
