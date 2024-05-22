//Given a list of integers, find the maximum value element present in it using Stream functions?

import java.util.*;

public class MaxNumberInList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println("Maximum number in list:- "+max);
    }
}
