package com.example.Employee_management_system.service;

import com.example.Employee_management_system.entity.Employee;
import com.example.Employee_management_system.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmpolyee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployess()
    {
        return employeeRepository.findAll();
    }
    public Optional<Employee> getEmployeeById(long id)
    {
        return employeeRepository.findById(id);
    }
}
