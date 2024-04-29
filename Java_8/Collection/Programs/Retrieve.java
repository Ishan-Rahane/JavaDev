package Collection.Programs;

import java.util.ArrayList;
import java.util.List;

public class Retrieve {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Red");
        colours.add("Black");

        System.out.println(colours);

        String s = colours.get(1);
        System.out.println(s);
    }
}
