import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nSelect the sort order (1 - growth | 2 - decrease): ");
        int sortOrder = scanner.nextInt();

        if (sortOrder == 1) {
            sortAscending(array);
            System.out.println("An ascending sorted array: " + Arrays.toString(array));
        } else if (sortOrder == 2) {
            sortDescending(array);
            System.out.println("A descending sorted array: " + Arrays.toString(array));
        } else {
            System.out.println("Selected the sort order does not exist");
        }

    }

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
