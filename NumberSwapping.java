import java.util.Scanner;

public class NumberSwapping {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Before swapping The Numbers:");
            System.out.println("1st Number: " + num1);
            System.out.println("2nd Number: " + num2);

              // Swap without using third variable
           // num1 = num1 + num2;
           // num2 = num1 - num2;
           // num1 = num1 - num2;

            // Swap using Temp variable
            
             int temp = num1;
             num1 = num2;
             num2 = temp; 
            System.out.println("After swapping The Numbers:");
            System.out.println("1st Number: " + num1);
            System.out.println("2nd Number: " + num2);
        }
    }
}
