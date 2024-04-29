package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
//    It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements.
//    It maintains the insertion order and permits null elements.
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();

        names.add("Ravi");//Adding object in LinkedHashSet
        names.add(null);
        names.add("Vijay");
        names.add("Ravi");
        names.add("");
        names.add(null);
        names.add("Ajay");

        for (String name : names) System.out.println(name);

    }
}
