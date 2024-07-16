package com.example.test.services;

import com.example.test.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee addEmployee(Employee employee);
    void deleteEmployee(long id);
    Employee updateEmployee(long id, Employee updateEmployee);
    Employee getById(long id);
}
