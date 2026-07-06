/**
 *  Java program to use Stack collection.
 */
package com.mycollections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an object of Stack.
        Stack<String> myStack = new Stack<>();

        // Adding elements to myStack.
        myStack.add("Stack");
        myStack.add("ArrayList");
        myStack.add("LinkedList");
        myStack.add("Vector");

        // Printing elements of myStack.
        System.out.println(myStack); // Output: [Stack, ArrayList, LinkedList, Vector]

        // Printing the first element.
        System.out.println(myStack.peek()); // Output: Vector

        // Printing elements of myStack.
        System.out.println(myStack); // Output: [Stack, ArrayList, LinkedList, Vector]

        // Using method pop().
        System.out.println(myStack.pop()); // Output: Vector

        // Printing elements of myStack.
        System.out.println(myStack); // Output: [Stack, ArrayList, LinkedList]

    }
}