package GeeksForGeeks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AFIndDuplicateElements {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 6, 9, 2, 3, 1, 3, 7, 4, 10, 20, 30, 40, 50};

        Arrays.stream(arr)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()>1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
