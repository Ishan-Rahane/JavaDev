package Strings;

public class CompareStrings {

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        //compare strings using == operator
        if (a==b)
            System.out.println("Strings are equal");
        else
            System.out.println("Not matching");

        //compare strings using equal()
        if (a.equalsIgnoreCase(b))
            System.out.println("Strings are equal");
        else
            System.out.println("Not matching");



        String str1="Scaler";
        String str2="Scaler";
        String str3=new String("Scaler");
        System.out.println(str1==str2);
        //true because both points to same memory allocation

        System.out.println(str1==str3);
        //false because str3 refers to instance created in heap

        System.out.println(str1.equals(str3));
        //true because both share same content
        //even if both are different string objects
    }
}
