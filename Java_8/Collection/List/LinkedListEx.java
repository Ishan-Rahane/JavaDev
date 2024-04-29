package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
// ArrayList uses doubly linked list and can store duplicate elements of different data types.
// It maintains insertion order
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Ravi");//Adding object in linkedList
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        //Traversing over the list
        Iterator itr = names.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());


    }
}
