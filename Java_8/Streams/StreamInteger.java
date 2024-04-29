package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInteger {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(1654);
        list.add(98);
        list.add(23);
        list.add(77);

        System.out.println("Printing the collection:"+list);

        //apply STREAM for processing the objects in collection
        List<Integer>ls = list.stream().filter(i->i%2!=0).collect(Collectors.toList());

        System.out.println("Printing the list after stream: "+ls);
    }
}
