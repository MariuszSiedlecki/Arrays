public class Task11 {
    public static void main(String[] args) {
        int[] numbers = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int sum = 0;
        for (int value : numbers) {
            if (value % 2 == 0)
                sum += value;

        }
        System.out.println("The result is:" + sum);
    }


}
