import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of meters: ");
        double meters = scanner.nextDouble();

        double miles = Math.round((meters * 0.000621371) * 1000.0) / 1000.0;
        double inches = Math.round((meters * 39.3701) * 1000.0) / 1000.0;
        double yards = Math.round((meters * 1.09361) * 1000.0) / 1000.0;

        System.out.println("\n1) convert to miles");
        System.out.println("2) convert to inches");
        System.out.println("3) convert to yards");
        System.out.print("Select an action: ");
        int action = scanner.nextInt();
        System.out.println();

        switch (action) {
            case 1:
                System.out.println(meters + " meters in miles: " + miles);
                break;
            case 2:
                System.out.println(meters + " meters in inches: " + inches);
                break;
            case 3:
                System.out.println(meters + " meters in yards: " + yards);
                break;
            default:
                System.out.println("Selected action does not exist!");
        }
    }
}
