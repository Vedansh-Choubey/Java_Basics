import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter 1st Number: ");
            int a = scanner.nextInt();

            System.out.println("Enter 2nd Number: ");
            int b = scanner.nextInt();

            System.out.println("Enter 3rd Number: ");
            int c = scanner.nextInt();

            int greatest = a;

            if (b > greatest) {
                greatest = b;
            }

            if (c > greatest) {
                greatest = c;
            }

            System.out.println("The Greatest Number of these Three Number is: " + greatest);
        }
    }
}
