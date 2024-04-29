package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

// ArrayList uses dynamic array and can store duplicate elements of different data types.
// It maintains insertion order
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ravi");//Adding object in arraylist
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        //Traversing over the list
        Iterator i = names.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
