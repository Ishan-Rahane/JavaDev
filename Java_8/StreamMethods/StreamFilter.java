package StreamMethods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        list.stream()
                .filter(l->l%3==0)
                .forEach(System.out::println);

//////////////////////////////////////////////////////////////////////

        List<String> list1 = Arrays.asList("Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");

        // Getting a stream consisting of the elements ending with 's'
        list1.stream()
                .filter(n->n.endsWith("s"))
                .forEach(System.out::println);
    }
}
