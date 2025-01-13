package com.test.components;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, String department, int teamSize) {
        super(name, department);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Department: " + department + ", Team Size: " + teamSize);
    }

    // Method overriding
    @Override
    public void login() {
        System.out.println("Manager login");
    }
}
