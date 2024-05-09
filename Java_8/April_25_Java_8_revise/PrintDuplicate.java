package April_25_Java_8_revise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicate {
    public static void main(String[] args) {
        Integer[] arr = {1,0,3,0,4,3};

        List<Integer> list = Arrays.stream(arr)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicates are: "+list);
    }
}
