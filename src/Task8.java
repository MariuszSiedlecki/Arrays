import java.util.Arrays;
import java.util.Collections;

public class Task8 {
    public static void main(String[] args) {
        int[] tab = {1, 50, 15, 20, 2, 30};
        System.out.println("Origin table: " + Arrays.toString(tab));
        System.out.println("Max number in this table: " + maxNumber(tab));
    }

    static int maxNumber(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

}
