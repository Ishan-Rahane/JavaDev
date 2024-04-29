package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        Integer[]array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};

        //convert array to list
        List<Integer> list = Arrays.asList(array);

        //Group elements by occurence
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        //Filter duplicate elements in map
        collect.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .forEach(entry-> System.out.println(entry.getKey()));
    }
}

//Array to List Conversion: The Arrays.asList(array) method is used to convert the array into a List.
// This is done because streams work more naturally with collections.

//Grouping by Element Occurrences: The list.stream() method converts the List into a stream.
// Then, Collectors.groupingBy(e -> e, Collectors.counting()) is used to group elements of the list by their occurrences.
// This results in a Map<Integer, Long> where keys represent distinct elements from the list and values represent the count of occurrences of each element.

//Filtering Duplicates: After grouping the elements, the entrySet().stream() method is called on the Map to get a stream of its entries. Then, filter() is used to keep only those entries whose value (count of occurrences) is greater than 1, which indicates duplicates.
//Printing Duplicates: Finally, forEach() is called to iterate over each entry in the filtered stream. For each entry, System.out.println(entry.getKey()) is executed to print the key (the duplicate element) to the console.