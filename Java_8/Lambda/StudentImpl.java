package Lambda;

public class StudentImpl {

    public static void main(String[] args) {

        Student s = (name) -> {
            return "The name of the student is "+name;
        };
        System.out.println(s.name("Ishan"));
    }
}
