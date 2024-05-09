package April_25_Java_8_revise;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40,50,10,20,10};

        Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(entry-> System.out.println(entry.getKey()));
//                .forEach(entry-> System.out.println(entry.getKey()+":"+ entry.getValue()));

    }
}
