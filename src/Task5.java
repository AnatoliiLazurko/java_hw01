import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int number = scanner.nextInt();

        if (number == 1 || number == 2 || number == 12) {
            System.out.println("\nWinter");
        } else if (number >= 3 && number <= 5) {
            System.out.println("\nSpring");
        } else if (number >= 6 && number <= 8) {
            System.out.println("\nSummer");
        } else if (number >= 9 && number <= 11) {
            System.out.println("\nAutumn");
        } else {
            System.out.println("\nMonth with such a number does not exist");
        }
    }
}
