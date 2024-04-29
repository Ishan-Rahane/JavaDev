package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {

    public static void main(String[] args) {

        int [] arr = new int []{1,2,3,4,5};

        System.out.println("Array: "+ Arrays.toString(arr));

        //convert to stream
        IntStream intStream = Arrays.stream(arr);

        System.out.println("Stream: "+Arrays.toString(intStream.toArray()));
    }
}
