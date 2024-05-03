package April_25_Array_String_Java_8;

public class SCountOfVowelConsonant {
    public static void main(String[] args) {
        String str = "Hello Ishan! How are you? Hope you're doing well.";

        long vowel = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        long consonant = str.toLowerCase().chars().filter(c -> "qwrtyplkjhgfdszxcvbnm".indexOf(c) != -1).count();

        System.out.println("Vowel count: "+vowel);
        System.out.println("Consonant count: "+consonant);

    }
}
//indexOf(c) is a method call that checks if a character c exists in a string and returns its index if found, otherwise returns -1.

//It checks if the character c is a vowel (i.e., 'a', 'e', 'i', 'o', or 'u') by looking for its index in the string "aeiou".
//If c is found in "aeiou", indexOf(c) returns its index in the string, otherwise, it returns -1.