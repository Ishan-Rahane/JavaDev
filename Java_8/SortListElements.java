//Given a list of integers, sort all the values (asc/des) present in it using Stream functions?
import java.util.*;
public class SortListElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().sorted().forEach(System.out::println);

        System.out.println("descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
