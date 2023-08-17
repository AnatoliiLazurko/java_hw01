import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum = scanner.nextInt();

        int result = firstNum * 100 + secondNum * 10 + thirdNum;

        System.out.println("\nresult: " + result);
    }
}
