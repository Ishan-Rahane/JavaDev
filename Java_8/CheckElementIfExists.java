public class CheckElementIfExists {


    private static boolean containsNumber(int[] arr, int i) {
        for (int n:arr){
            if(i==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr =  {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.println(containsNumber(arr,2015));

        System.out.println(containsNumber(arr,1789));

    }


}
