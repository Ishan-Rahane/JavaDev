import java.util.Arrays;
import java.util.List;

//How to use map to convert object into Uppercase in Java 8?
public class UpperCase {
    public static void main(String[] args) {
        String[] str = {"aa","bb","cc","dd"};
        List<String> list = Arrays.stream(str).map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
