package April_25_Array_String_Java_8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SReverseString {
    public static void main(String[] args) {
        String str = "Hello Ishan! How are you? Hope you're doing well.";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Traditional way to reverse: "+rev);

    }
}
