package April_25_Array_String_Java_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SCountNumberOfPunctuationChar {
    public static void main(String[] args) {
        String str = "Hello Ishan! How are you? Hope you're doing well.";
        long count = countPunctuation(str);
        System.out.println("Count of punctuation characters is: "+count);
    }

    private static long countPunctuation(String str) {
        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher(str);
        return m.results().count();
    }
}
