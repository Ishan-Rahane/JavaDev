package Strings;

import java.util.List;

public class Sum {

    public static void main(String[] args) {
        List<Integer> list = List.of(12,33,45,56,67,78,89,90);

        int even = list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even number is: "+even);

        int odd = list.stream()
                .filter(e -> e % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd number is: "+odd);

    }
}
