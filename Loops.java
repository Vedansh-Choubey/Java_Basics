import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for Loop
        
//        for(int i = 100; i>0; i--){
//            System.out.println(i);
//        }  
 // while Loop

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = sc.nextInt();
        while(i<100){
            i++;
            System.out.println(i);
        }
    
    }
    }


