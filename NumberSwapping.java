import java.util.Scanner;

public class NumberSwapping {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.println("\nBefore swapping:");
            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);

            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;

            System.out.println("After swapping The Numbers:");
            System.out.println("1st Number: " + num1);
            System.out.println("2nd Number: " + num2);
        }
    }
}
