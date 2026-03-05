import java.util.Scanner;

public class PalindromeString {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();

//        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
//        String reversed = new StringBuilder(cleaned).reverse().toString();

//        if (cleaned.equals(reversed)) {
//            System.out.println("It is a palindrome string.");
//       } else {
            System.out.println("It is not a palindrome string.");
//       }

//      scanner.close();
//    }
}

        //Checking Palindrome Number 

public class PalindromeNumberCheck {

    public static boolean is_Palindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (is_Palindrome(num)){
            System.out.println("Number is Palindrome.");
                        }
        else{
            System.out.println("Number is NOT Palindrome.");
        }

        sc.close();
    }
}
