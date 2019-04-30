import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25,1,30,5,2,15,10,3,4);
        System.out.println("original list : " + list);
        Collections.sort(list);
        System.out.println("sorted list : " + list);
    }
}
