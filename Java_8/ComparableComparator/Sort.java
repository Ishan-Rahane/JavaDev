package ComparableComparator;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Ishan","88889090"));
        emp.add(new Employee(2,"Raj","78781212"));
        emp.add(new Employee(3,"Simran","12127890"));
        emp.add(new Employee(4,"Rani","56568085"));

        System.out.println(emp);

    }
}
