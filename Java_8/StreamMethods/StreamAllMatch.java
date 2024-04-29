package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAllMatch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,34,56,78,90,66);

        // Check if ALL elements of stream
        // are divisible by 3 or not using
        // Stream allMatch(Predicate predicate)
        boolean answer = list.stream().allMatch(n->n%3==0);
        System.out.println(answer);


//        allMatch() function to check whether strings have length greater than 2.
        Stream<String> stream = Stream.of("Geeks", "for","GeeksQuiz", "GeeksforGeeks");
        boolean annwer1 = stream.allMatch(m->m.length()>2);
        System.out.println(annwer1);
    }
}
