import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TryOuts {
    public static void main(String[] args) {

        int[] arr = {12,34,45,65};
        int newEle = 300;

        System.out.println("-------------------------PUSH ELEMENTS IN ARRAY-------------------------------------");

        int [] newArr = IntStream.concat(IntStream.of(newEle),IntStream.of(arr)).toArray();
        System.out.println("New Array after inserting new element: "+Arrays.toString(newArr));

        System.out.println("-------------------------POP ELEMENTS FROM ARRAY-------------------------------------");

        //let's convert array to list
        List<Integer> list = new ArrayList<>();
        for (int i:arr){
            list.add(i);
        }
        list.forEach(System.out::println);

        if (!list.isEmpty()){
            list.remove(list.size()-1);
        }

        //convert list back to array
        Object[] array = list.toArray();

        //print array after POPPING elements
        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------INDEX OF ELEMENTS FROM ARRAY-------------------------------------");

        int i1 = IntStream.range(0, newArr.length)
                .filter(i -> i == 2)
                .map(i -> newArr[i])
                .findFirst()
                .orElseThrow(ArrayIndexOutOfBoundsException::new);
        System.out.println("Element at index 2 is "+i1);

        System.out.println("-------------------------IF ELEMENTS PRESENT IN ARRAY-------------------------------------");

        boolean b = Arrays.stream(newArr).anyMatch(i -> i == 12);
        System.out.println("IS the element present: "+b);

        System.out.println("-------------------------SQUARE THE ELEMENTS PRESENT IN ARRAY-------------------------------------");

        int[] array1 = Arrays.stream(newArr).map(i -> i * i).toArray();
        System.out.println("SQaure of array elements is :- "+Arrays.toString(array1));
        int sum = Arrays.stream(newArr).sum();
        System.out.println("Sum of array elements is :- "+sum);
        //without using sum()
        int reduce = Arrays.stream(newArr).reduce(0, (a, d) -> a + d);
        System.out.println("Sum of array elements without using sum() is :- "+reduce);

        System.out.println("-------------------------CONCAT TWO ARRAYS-------------------------------------");
        int[] concat = IntStream.concat(Arrays.stream(newArr), Arrays.stream(array1)).toArray();
        System.out.println("Concatenated arrays are:- "+Arrays.toString(concat));

        System.out.println("-------------------------JOIN '-' IN ARRAYS-------------------------------------");

        String join = Arrays.stream(array1).mapToObj(String::valueOf).collect(Collectors.joining("-"));
        System.out.println("After using '-' in array elements:- "+join);

    }
}
