// Q. Create a menu-driven program to manage and display student marks.
import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to continue or 0 to stop");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("Very Good");
                } else if (marks >= 70) {
                    System.out.println("Good");
                } else if (marks >= 50) {
                    System.out.println("Not bad");
                } else {
                    System.out.println("Fail");
                }
            } else if (choice == 0) {
                System.out.println("STOP");
            } else {
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice != 0);

        sc.close();
    }
}
