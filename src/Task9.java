import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println("original list: " + list);
        Collections.reverse(list);
        System.out.println("reversed list: " + list);
    }
}