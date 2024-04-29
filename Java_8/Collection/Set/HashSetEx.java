package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

//    HashSet implments Set interface. It represents the collection that uses hash table to store the elements.
//    It is unordered set of elements and only unique elements are allowed.
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Ravi");//Adding object in hashSet
        names.add(null);
        names.add("Vijay");
        names.add("Ravi");
        names.add("");
        names.add(null);
        names.add("Ajay");

        Iterator itr = names.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
