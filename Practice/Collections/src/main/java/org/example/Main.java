package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Ishan Rahane";
        StringBuffer buffer = new StringBuffer(name);
        System.out.println(buffer.reverse());

//        type safe
        List<String> list = new ArrayList<>();
        list.add("Ishan");
        list.add("Virat");
        list.add("Rohit");
        list.add("MSD");
        System.out.println(list);

//        for each loop
        System.out.println("_______________________FOR-EACH-LOOP_______________________");
        for(String str:list) {
            System.out.println(str + "\t" + str.length());
        }
        System.out.println("_______________________FORWARD_______________________");
//        using iterator: FORWARD traversing
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String n = itr.next();
            System.out.println(n);
        }

        System.out.println("_______________________BACKWARD_______________________");
//        using ListIterator: BACKWARD traversing
        ListIterator<String> ls = list.listIterator(list.size());
        while(ls.hasPrevious()){
            String n = ls.previous();
            System.out.println(n);
        }

//        for each method
        System.out.println("_______________________FOR-EACH-METHOD_______________________");
        list.forEach(e-> System.out.println(e));

//        un type safe
        List list1 = new ArrayList();
        list1.add("Ishan");
        list1.add(100);
        list1.add(12.34);
        System.out.println(list1);

        Map<String,Integer> map = new HashMap<>();
        map.put("Ishan",27);
        map.put("Virat",35);
        map.put("Rohit",36);
        map.put("MSD",44);

        map.forEach((e,f)-> System.out.println(e+":"+f));

    }

}