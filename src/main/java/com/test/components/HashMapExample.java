package com.test.components;

import java.util.HashMap;

public class HashMapExample {
    public static HashMap<String, Integer> people = new HashMap<String, Integer>();

    public static void run() {
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        // Print keys
        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
// Print values
        for (Integer i : people.values()) {
            System.out.println("Age: " + i);
        }
    }
}
