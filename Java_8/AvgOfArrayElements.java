import java.util.Arrays;

public class AvgOfArrayElements {

    public static void main(String[] args) {
        int [] arr =  {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.println("Original array:-" + Arrays.toString(arr));
        int sum=0;

        for (int i=0; i< arr.length;i++){
            sum = sum+i;
        }

        double avg = sum/ arr.length;
        System.out.println("Average of array elements:- "+avg);
    }
}
