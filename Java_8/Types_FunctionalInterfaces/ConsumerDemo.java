package Types_FunctionalInterfaces;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {

//    Consumer<T> represents an operation that accepts a single argument and returns no result.

    public static void main(String[] args) {

        Consumer<Integer> consumer = (t) -> System.out.println("Printing: "+t);
        consumer.accept(20);

        Consumer<String> consumer1 = (t) -> System.out.println("Winner of IPL 2023 is: "+t);
        consumer1.accept("Chennai Super Kings");

        Consumer<Integer> consumer2 = (t) -> {
            if(t%2==0)
                System.out.println("EvenNumber");
            else
            System.out.println("Odd  Number");
        };
        consumer2.accept(89);
    }
}
