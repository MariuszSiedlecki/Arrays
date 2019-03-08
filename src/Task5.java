public class Task5 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 5, 6, 7};
        int[] tab2 = {1, 2, 3, 4};
        System.out.println("Return middle element of array:" + middleElementArray(tab1));
        System.out.println("Return middle element of array:" + middleElementArray(tab2));
    }

    static int middleElementArray(int[] tab) {
        return tab[(tab.length - 1) / 2];
    }
}
