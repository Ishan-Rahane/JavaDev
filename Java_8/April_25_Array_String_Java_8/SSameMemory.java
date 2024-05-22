package April_25_Array_String_Java_8;

// If you apply the intern() method to a few strings, you will ensure that all strings having the same content share the same memory.
public class SSameMemory {
    public static void main(String[] args) {
        String s = new String("Ishan Rahane").intern();
        String s1 = new String("Ishan Rahane").intern();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s==s1);
    }
}
