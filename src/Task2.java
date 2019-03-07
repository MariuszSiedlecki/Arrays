public class Task2 {
    public static void main(String[] args) {
        int[] tab = {5, 6, 3, 5};
        System.out.println("Return penultimate element array: " + penultimateElementArraY(tab));
    }

    static int penultimateElementArraY(int[] tab) {
        return tab[tab.length - 2];
    }
}
