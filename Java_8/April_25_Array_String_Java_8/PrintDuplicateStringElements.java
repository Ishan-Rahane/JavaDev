package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateStringElements {

    public static void main(String[] args) {
        String[] array1 = {"John", "banana", "orange", "apple", "grape"};
        String[] array2 = {"banana", "kiwi", "John", "orange"};

        String[] concat = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(String[]::new);

        Arrays.stream(concat)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

    }
}
