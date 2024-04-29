package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFindAny {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,34,56,99,67,78);
        // Stream anyMatch(Predicate predicate)
        boolean answer = list.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);

        System.out.println(answer);

        Stream<String> stream = Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        // Check if Character at 1st index is
        // UpperCase in any string or not using
        // Stream anyMatch(Predicate predicate)
        boolean answer1 = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

        // Displaying the result
        System.out.println(answer1);
    }
}
