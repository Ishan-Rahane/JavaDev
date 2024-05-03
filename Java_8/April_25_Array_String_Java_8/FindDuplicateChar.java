package April_25_Array_String_Java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateChar {

    public static void main(String[] args) {
        String s = "Hello World";
        Map<Character, Long> duplicateChars = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));;
        System.out.println("Duplicate Characters: " + duplicateChars.keySet());
    }
}

//We have a string s which contains the input string "Hello World".

//We then use a stream on this string (s.chars()) which converts the string into an IntStream of its characters.
//With mapToObj(c -> (char) c), each integer in the stream (representing Unicode values of characters) is mapped to its corresponding character.

//filter(c -> s.indexOf(c) != s.lastIndexOf(c)) filters out the characters which occur more than once in the string.

// This is done by checking if the index of the character is different from its last index. If it's different, it means the character occurs more than once in the string.
//Finally, collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) collects the filtered characters into a map where the key is the character itself, and the value is the count of occurrences of that character.