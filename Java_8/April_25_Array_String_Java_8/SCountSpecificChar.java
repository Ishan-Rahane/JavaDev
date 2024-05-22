package April_25_Array_String_Java_8;

public class SCountSpecificChar {
    public static void main(String[] args) {
        String s = "Hello Ishan, i hope you are well!";

        char target = 'l';

        long count = s.chars().filter(c -> c == target).count();
        System.out.println("Count of"+target+" is: "+count);
    }
}
