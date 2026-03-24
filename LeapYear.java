import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("A Program To Check If the Year is leap Year or Not \nEnter Any Year: ");
            int year = scanner.nextInt();

            boolean isLeapYear = false;

            if (year % 4 == 0) {               // 1st Condition
                if (year % 100 == 0) {         // 2nd Condition under 1st Condition
                    if (year % 400 == 0) {     // 3rd Condition under the 1st and 2nd Conditions 
                        isLeapYear = true;     // all three conditions should be true 
                    }
                } else {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
