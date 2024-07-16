package com.example.test.services.impl;

import com.example.test.entities.Employee;
import com.example.test.repositories.EmployeeRepository;
import com.example.test.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(long id, Employee updateEmployee) {
        updateEmployee.setIdEmployee(id);
        return employeeRepository.save(updateEmployee);
    }

    @Override
    public Employee getById(long id) {
        return employeeRepository.findById(id).orElseThrow();
    }
}
