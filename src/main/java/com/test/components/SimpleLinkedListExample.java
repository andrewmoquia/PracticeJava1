package com.test.components;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SimpleLinkedListExample {
    public static void run() {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("Initial LinkedList: " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst("Mango");
        System.out.println("After adding at the beginning: " + linkedList);

        // Add an element at the end
        linkedList.addLast("Orange");
        System.out.println("After adding at the end: " + linkedList);

        // Remove the first element
        linkedList.removeFirst();
        System.out.println("After removing the first element: " + linkedList);

        // Remove the last element
        linkedList.removeLast();
        System.out.println("After removing the last element: " + linkedList);

        // Access an element by index
        String secondElement = linkedList.get(1);
        System.out.println("Element at index 1: " + secondElement);

        // Check if the LinkedList contains a specific element
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("Does the LinkedList contain 'Cherry'? " + containsCherry);

        linkedList.sort(Collections.reverseOrder());

        // Iterate through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
