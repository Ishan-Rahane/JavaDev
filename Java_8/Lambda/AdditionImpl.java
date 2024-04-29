package Lambda;

public class AdditionImpl {

    public static void main(String[] args) {

        //without return keyword
        Addition a1 = (a,b)->
            a+b;
        System.out.println(a1.add(10,20));

        //with return keyword
        Addition a2 = (a,b)->{
            return a+b;
        };
        System.out.println(a2.add(100,20));

    }
}
