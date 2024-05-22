package April_25_Array_String_Java_8;

import java.util.HashMap;

public class SHahsmap {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        String key="apple";
        map.put(key,10);

        int value = map.get(key);
        System.out.println("The value associated with key apple: "+value);

        // Now let's try changing the key
        key = "banana"; // We're changing the value of the variable key1

        // Retrieving the value associated with the modified key "banana"
        // This will not work because the key has changed
        int val = map.get(key);
        System.out.println("The value associated with key banana: "+val);
    }
}
