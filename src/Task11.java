import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 3;
        char symbol = '*';

        System.out.print("Select direction ( h-horizontal | v-vertical ): ");
        char direction = scanner.next().charAt(0);

        printLine(length, direction, symbol);
    }

    public static void printLine(int length, char direction, char symbol) {
        if (direction == 'h') {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == 'v') {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Selected direction does not exist");
        }
    }
}