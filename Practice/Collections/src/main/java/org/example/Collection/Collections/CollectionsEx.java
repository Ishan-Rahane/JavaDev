package org.example.Collection.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Java", "Go", "Python"));
        System.out.println("Initial list is: "+list);

        String [] sarr = {"C#","Ruby"};
        Collections.addAll(list,sarr);
        System.out.println("New list is: "+list);

    }
}
