package StreamMethods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {

        DoubleStream Stream1 = DoubleStream.of(1520, 1620);
        DoubleStream Stream2 = DoubleStream.of(1720, 1820);

        DoubleStream.concat(Stream1,Stream2)
                .forEach(System.out::println);

     //////////////////////////////////////////////////////////////////////

        Stream<String> stream1 = Stream.of("Geeks", "for", "GeeksforGeeks");
        Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for");

        Stream.concat(stream1,stream2).distinct().forEach(System.out::println);
    }
}
