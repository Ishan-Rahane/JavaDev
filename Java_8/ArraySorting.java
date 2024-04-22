import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        int [] arr =  {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String [] str = {"Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original array is: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(arr));

        System.out.println("Original array is: "+ Arrays.toString(str));
        Arrays.sort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(str));
    }
}
