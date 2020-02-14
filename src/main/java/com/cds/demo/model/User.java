package com.cds.demo.model;

public class User {

    private String name;
    private float salary;

    public User(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public User() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}
