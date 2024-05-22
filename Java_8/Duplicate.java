//How to find duplicate elements in a given integers list in java using Stream functions?

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,32,98,98,32,15);

        Set<Integer> set = new HashSet<>();

        list.stream().filter(i->!set.add(i)).forEach(System.out::println);

    }
}
