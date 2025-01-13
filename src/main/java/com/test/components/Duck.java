package com.test.components;


import com.test.interfaces.Flyable;
import com.test.interfaces.Swimmable;

public class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("The duck is flying!");
    }

    public void swim() {
        System.out.println("The duck is swimming!");
    }
}
