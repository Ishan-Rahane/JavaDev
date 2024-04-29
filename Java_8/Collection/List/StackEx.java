package org.example.Collection.List;

import java.util.Stack;

public class StackEx {
//    Stack is subclass of vector. It implements LIFO data structure
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Ayush");
        names.push("Garvit");
        names.push("Amit");
        names.pop();
        names.push("Ashish");
        names.push("Garima");
        names.pop();

        for (String s:names)
            System.out.println(s);
    }
 }
