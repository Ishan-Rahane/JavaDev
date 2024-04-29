package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstElement {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("JKL");
        list.add("MNO");

        System.out.println(list);

        //create a stream
        Optional<String> s = list.stream().findFirst();
        System.out.println(s);

    }
}
