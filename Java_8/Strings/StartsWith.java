package Strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWith {

    public static void main(String[] args) {
        List<String> names = List.of("Arjun","Sham","Raj","Ajay","Sid","Ishan");

        List<String> a = names.stream()
                .filter(e -> e.startsWith("A"))
                .toList();

        System.out.println(a);

    }
}
