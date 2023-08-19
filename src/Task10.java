import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] mainArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            mainArray[i] = random.nextInt(201) - 100;
        }

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : mainArray) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int[] negativeArray = new int[negativeCount];
        int[] positiveArray = new int[positiveCount];

        int evenIndex = 0;
        int oddIndex = 0;
        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int num : mainArray) {
            if (num % 2 == 0) {
                evenArray[evenIndex] = num;
                evenIndex++;
            } else {
                oddArray[oddIndex] = num;
                oddIndex++;
            }
            if (num < 0) {
                negativeArray[negativeIndex] = num;
                negativeIndex++;
            } else if (num > 0) {
                positiveArray[positiveIndex] = num;
                positiveIndex++;
            }
        }

        System.out.println("Main array:");
        for (int num : mainArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven numbers:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nOdd numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nNegative numbers:");
        for (int num : negativeArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nPositive numbers:");
        for (int num : positiveArray) {
            System.out.print(num + " ");
        }
    }
}
