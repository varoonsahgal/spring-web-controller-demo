package com.intuit.example.models;

import java.time.LocalDate;

public class Employee {

    private Long id;
    private String name;
    private String job;
    private Double salary;
    private LocalDate dateOfBirth;

    // No-arg constructor
    public Employee() {
    }

    // All-args constructor
    public Employee(Long id, String name, String job, Double salary, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
