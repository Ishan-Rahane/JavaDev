package April_25_Array_String_Java_8;

import java.util.Arrays;

public class SAnagramStrings {

    public static void main(String[] args) {
        String s = "listen";
        String s1 = "silent";

//        String s = "heart";
//        String s1 = "earth";

        if(isAnagram(s,s1)){
            System.out.println(s+" and "+s1+" are anagram strings");
        }
        else
            System.out.println(s+" and "+s1+" are not anagram strings");
    }

    private static boolean isAnagram(String s, String s1) {
        String cleanstr1 = s.replaceAll("\\s","").toLowerCase();
        String cleanstr2 = s1.replaceAll("\\s","").toLowerCase();

        char[] charArray1 = cleanstr1.toCharArray();
        char[] charArray2 = cleanstr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
