import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter percent: ");
        double percent = scanner.nextDouble();

        double result = (percent / 100) * number;
        long roundedResult = Math.round(result);

        System.out.println("\nresult: " + roundedResult);
    }
}
