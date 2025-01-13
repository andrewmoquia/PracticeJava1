package com.test.components;

public class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void login() {
        System.out.println("Employee login!");
    }
}
