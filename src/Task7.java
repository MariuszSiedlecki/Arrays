import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        System.out.println("Original table: " + Arrays.toString(tab));
        System.out.println("Sum of numbers in this table: " + returnSumNumbers(tab));
    }

    static int returnSumNumbers(int[] tab) {
        return tab[0] + tab[1] + tab[2] + tab[3];
    }
}

