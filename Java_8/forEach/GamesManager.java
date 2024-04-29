package org.example.forEach;

import java.util.ArrayList;
import java.util.List;

public class GamesManager {
    public static void main(String[] args) {
        List<String> games = new ArrayList<>();
        games.add("Total Overdose");
        games.add("CS");
        games.add("EA Cricket 2007");
        games.add("GTA Vice City");

        for (String g : games)
            System.out.println(g);

        System.out.println();

        games.forEach(g -> System.out.println(g));

        System.out.println();

        games.forEach(System.out::println);

        System.out.println();

        for(int i=0;i<games.size();i++){
            System.out.println(games.get(i));
        }
    }
}
