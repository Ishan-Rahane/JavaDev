package org.example.Strings;

import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> names = List.of("Arjun","Sham","Raj","Ajay","Sid","Ishan");

        List<String> alist = names.stream()
                .sorted()
                .toList();

        System.out.println("Ascending order list: "+alist);

        List<String> dlist = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Descending order list: "+dlist);
    }
}
