package com.intuit.springwebdemo.example.controller;

import com.intuit.example.models.Employee;


import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Map<Long, Employee> employeeStore = new HashMap<>();
    private static final AtomicLong idCounter = new AtomicLong();

    // 1. Add a new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        Long id = idCounter.incrementAndGet();
        employee.setId(id);
        employeeStore.put(id, employee);
        return employee;
    }

    // 2. Get all employees
    @GetMapping("/employees")
    public Collection<Employee> getAllEmployees() {
        return employeeStore.values();
    }

    // 3. Get employee by ID (example: /employee/2)
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeStore.get(id);
    }

    // 4. Get employee by name (example: /employee?name=bart)
    @GetMapping
    public Employee getEmployeeByName(@RequestParam String name) {
        return employeeStore.values()
                .stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // 5. Update an employee
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        if (employee.getId() == null || !employeeStore.containsKey(employee.getId())) {
            return null;
        }
        employeeStore.put(employee.getId(), employee);
        return employee;
    }

    // 6. Delete an employee (example: /employee/2)
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeStore.remove(id);
        return "Employee with id " + id + " deleted";
    }
}
