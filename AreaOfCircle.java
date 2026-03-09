import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter radius of circle: ");
            double radius = scanner.nextDouble();

            double area = Math.PI * radius * radius;   //For Calculating Area 
            double circumference = 2 * Math.PI * radius;   //For Calculating Circumference 
            
            System.out.println("Area of circle: " + area);   //Printing Calculated Area 
            System.out.println("Circumference of circle: " + circumference);  //Printing Calculated CIRCUMFERENCE 
             }
    }
}
