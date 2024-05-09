package April_25_Java_8_revise;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndFrequency {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};

        Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()>1)
                .forEach(i-> System.out.println(i.getKey()+":"+i.getValue()));
    }
}
