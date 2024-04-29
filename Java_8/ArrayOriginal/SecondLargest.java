package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] array = {10, 20, 5, 15, 25,30};

        int snum = secondLargest(array);

        System.out.println("The seconde largest number is :" +snum);
    }

    private static int secondLargest(int[] array) {
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int number : array){  //let's consider number=10
            if(number>l){
                sl=l;
                l=number;
            } else if (number > sl && number < l && number != l) {
                sl = number;
            }
        }
        return sl;
    }

/*
    private static int secondLargest(int[] array) {
        int temp=0;
        for (int i=0 ; i<array.length; i++){
            for(int j=i+1 ; j<array.length ; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return temp;
    }
*/







}
