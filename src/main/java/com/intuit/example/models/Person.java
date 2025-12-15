package com.intuit.example.models;

public class Person {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
