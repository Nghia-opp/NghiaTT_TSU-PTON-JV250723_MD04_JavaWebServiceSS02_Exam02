package com.exam02.service;

import com.exam02.model.entity.Employee;
import com.exam02.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }
}
