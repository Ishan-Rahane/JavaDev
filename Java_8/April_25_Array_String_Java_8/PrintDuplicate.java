package April_25_Array_String_Java_8;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicate {

    public static void main(String[] args) {
        Integer[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 4,33};

        List<Integer> collect = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicate elements are: "+collect);

    }
}
