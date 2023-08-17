import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a six-digit number: ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        if (numberStr.length() == 6) {
            int digit6 = number % 10;
            int digit5 = (number / 10) % 10;
            int digit4 = (number / 100) % 10;
            int digit3 = (number / 1000) % 10;
            int digit2 = (number / 10000) % 10;
            int digit1 = number / 100000;

            int result = digit6 * 100000 + digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;

            System.out.println("Result: " + result);
        } else {
            System.out.println("You didn't enter a six-digit number");
        }
    }
}
