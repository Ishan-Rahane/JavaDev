//Given a list of integers, find the total number of elements present in the list using Stream functions?

import java.util.*;

public class CountNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        long count = list.stream().count();
        System.out.println("Count of elements in list: "+count);
    }

}
