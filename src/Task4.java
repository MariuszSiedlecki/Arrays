public class Task4 {
    public static void main(String[] args) {
        int[] tab = {10, 1, 3, 5};
        System.out.println("Sum first end last elements table:" + sumFirstEndLastArrays(tab));

    }

    static int sumFirstEndLastArrays(int[] tab) {
        return tab[0] + tab[tab.length - 1];

    }
}

