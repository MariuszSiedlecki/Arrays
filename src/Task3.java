public class Task3 {
    public static void main(String[] args) {
        int[] tab = {5, 2, 3};
        System.out.println("Sum of the array of two elements: " + sumTwoElementsArray(tab));
    }

    static int sumTwoElementsArray(int[] tab) {
        return tab[0] + tab[1];
    }
}
