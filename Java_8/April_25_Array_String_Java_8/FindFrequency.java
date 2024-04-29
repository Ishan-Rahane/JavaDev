package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};

        // Using Java 8 streams and collectors to find frequency of elements
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((key,value)-> System.out.println(key+":"+value));
    }
}

//Sure! Let's break down the code:

    //We import necessary classes:
//Arrays to work with arrays.
//Map to store key-value pairs.
//Function to define a function.
//Collectors to perform various operations on streams and collect results.

//We have a Main class with a main method which serves as the entry point of the program.
//Inside the main method, we create an array of integers named array. This is the array for which we want to find the frequency of elements.

//Next, we use Java 8 features, particularly streams, to find the frequency of elements in the array. Here's how it's done:
//We convert the array to a stream using Arrays.stream(array).
//We use the collect terminal operation to collect elements of the stream into a map. We use Collectors.groupingBy(Function.identity(), Collectors.counting()) as the collector.
//   -->  Collectors.groupingBy(Function.identity()) groups the elements of the stream by their identity, meaning each distinct element will be a key in the resulting map.
//   -->  Collectors.counting() is a downstream collector which counts the occurrences of each element in the group.
//This results in a map where keys are the elements of the array, and values are the frequencies of those elements.

//We store this frequency map in the frequencyMap variable.
//Finally, we iterate over the frequencyMap and print each key-value pair, where the key represents the array element and the value represents its frequency.