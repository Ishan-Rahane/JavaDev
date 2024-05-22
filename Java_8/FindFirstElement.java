//Given the list of integers, find the first element of the list using Stream functions?


import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        Integer i = list.stream().findFirst().orElse(null);
        System.out.println("First number in list: "+i);
    }
}
