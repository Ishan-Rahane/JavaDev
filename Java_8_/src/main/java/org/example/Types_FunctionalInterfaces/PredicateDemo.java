package org.example.Types_FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

//    Predicate<T> represents a predicate (boolean-valued function) of one argument.

    public static void main(String[] args) {

            Predicate<Integer> predicate = (t) -> {
                if (t % 2 == 0)
                    return true;
                else
                    return false;
            };
        System.out.println(predicate.test(189));

            //using stream
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            list.stream().filter(predicate).forEach(t->System.out.println(t));
        }
    }

