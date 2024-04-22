public class MainClass {

    public static void main(String[] args) {
        System.out.println(SuperClass.staticVar); // Output: 10
        System.out.println(SubClass.staticVar);   // Output: 20

        SuperClass.method(); // Output: "Superclass static method"
        SubClass.method();   // Output: "Subclass static method"

        // Accessing superclass static member through subclass
//        System.out.println(SubClass.staticVar);   // Output: 20
//        System.out.println(((SuperClass) SubClass).staticVar); // Output: 10

        // Accessing superclass static method through subclass
//        SuperClass.method(); // Output: "Superclass static method"
//        ((SuperClass) SubClass).method(); // Output: "Superclass static method"    }
    }

}
