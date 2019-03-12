import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {4, 5, 6};
        System.out.println("connected two tables: " + Arrays.toString(connectingTwoTables(tab1, tab2)));
    }

    static int[] connectingTwoTables(int[] a, int[] b) {
        int[] sum = new int[6];
        sum[0] = a[0];
        sum[1] = a[1];
        sum[2] = a[2];
        sum[3] = b[0];
        sum[4] = b[1];
        sum[5] = b[2];
        return sum;

    }
}
