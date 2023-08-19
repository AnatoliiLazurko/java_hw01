import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Namber of zeros: " + zeroCount);
    }
}
