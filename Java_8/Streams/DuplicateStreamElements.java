package Streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateStreamElements {

    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream)
    {
        Set<T> items = new HashSet<>();

        // Return the set of duplicate elements
        return stream
               .filter(n -> !items.add(n))
               .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5,34,65,43,876,65,443,65,5);

        System.out.println(findDuplicateInStream(stream));
    }
}
