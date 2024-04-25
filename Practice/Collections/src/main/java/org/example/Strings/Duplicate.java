package org.example.Strings;

import java.util.List;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,23,45,4,1,23,68,77,34);

        List<Integer> list1 = list.stream()
                .distinct()
                .toList();

        System.out.println(list1);
    }
}
