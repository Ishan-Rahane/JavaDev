package Strings;

public class StringManipulation {
    public static void main(String[] args) {

        String s = "Scaler";
        String i = "Institution";

        System.out.println(s);
        System.out.println(i);

        //suppose i want to append the string inputs
        i+=", Mumbai";
        System.out.println(i);

//        use string builder
        StringBuilder sb = new StringBuilder(i);
        sb.append("-411012");
        System.out.println(sb);

    }
}
