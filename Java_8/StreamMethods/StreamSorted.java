package StreamMethods;

import java.util.*;

public class StreamSorted {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");

        // displaying the stream with elements sorted in natural order
        list.stream().sorted().forEach(System.out::println);
    }
}
