//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

import java.util.*;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}

class ListToMapExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Alice"),
                new Person(2, "Bob"),
                new Person(1, "Charlie"),
                new Person(3, "David"),
                new Person(2, "Eve")
        );

        // Group by id and store in sorted order using TreeMap
        Map<Integer, List<Person>> map = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getId,
                        TreeMap::new,
                        Collectors.toList()
                ));

        // Print the sorted map
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
