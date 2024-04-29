package org.example.Collection.Programs;

import java.util.ArrayList;
import java.util.List;

public class AddFirstPosition {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Red");
        colours.add("Black");

        colours.add(1,"Orange");
        System.out.println(colours);
    }
}
