//How to count each element/word from the String ArrayList in Java8?
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountChars {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
