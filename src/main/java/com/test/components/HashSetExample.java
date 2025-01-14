package com.test.components;

import java.util.HashSet;
import java.util.Iterator;

// A HashSet is a collection of items where every item is unique
public class HashSetExample {
    public static HashSet<String> cars = new HashSet<String>();

    public static void run() {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
