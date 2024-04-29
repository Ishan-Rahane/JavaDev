package StreamMethods;

import java.util.*;
import java.util.stream.Stream;

public class StreamForEach {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        list.forEach(s -> System.out.println(s));

        System.out.println();

        //forEach in stream
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> l = new ArrayList<>();
        l.add("India");
        l.add("USA");
        l.add("UK");
        l.add("UAE");

        l.stream().forEach(System.out::println);
    }
}
