package Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoolectionsIntEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,23,54,2,87,5));

        System.out.println("Initial list is: "+ list);

        System.out.println("The largest element in the list is: "+Collections.max(list));

    }
}
