package April_25_Array_String_Java_8;

public class SRemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = "Hi Ishan, how are you doing?";

        String s1 = s.replaceAll("\\s", "");
        System.out.println(s1);
    }
}
