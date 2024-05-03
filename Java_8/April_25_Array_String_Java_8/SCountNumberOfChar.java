package April_25_Array_String_Java_8;

public class SCountNumberOfChar {
    public static void main(String[] args) {
        String str = "Hello Ishan!";

        long count = str.chars().count();
        System.out.println("Number of characters are: "+count);

    }
}
