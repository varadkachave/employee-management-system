package com.example.Employee_management_system.controller;

import com.example.Employee_management_system.entity.Employee;
import com.example.Employee_management_system.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController (EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.createEmpolyee(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployess();
    }
    @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Long id)
        {
            return employeeService.getEmployeeById(id)
            .orElseThrow(() -> new RuntimeException("employee not found"));
        }

}
