//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class Distinct {

    public static boolean checkDistinct(int [] nums){
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .toList();

        Set<Integer> set = new HashSet<>(list);
        if(set.size() == list.size()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        boolean b = checkDistinct(arr);
        System.out.println(b);
    }

}
