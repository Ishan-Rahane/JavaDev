package org.example.Lambda;

import java.util.*;

public class Employee {

    public static void main(String[] args) {
        List<String> emp = new ArrayList<>();
        emp.add("Ishan");
        emp.add("Raj");
        emp.add("Rani");
        emp.add("Sham");

        emp.forEach(e -> {
            System.out.println(e);
        });

//////////////////////////////////////////////////////////////////////////
    List<Integer> empId = new ArrayList<>();
        empId.add(101);
        empId.add(102);
        empId.add(103);
        empId.add(104);
        empId.add(105);

        for (Integer i : empId)
            System.out.println(i);

        empId.forEach(System.out::println);
    }
}