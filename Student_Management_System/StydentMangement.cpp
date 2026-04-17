import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}

