// Q. Print the multiplication table of a given number.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print table : ");
        int n = sc.nextInt();

        System.out.println(n);
        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(n*4);
        System.out.println(n*5);
        System.out.println(n*6);
        System.out.println(n*7);
        System.out.println(n*8);
        System.out.println(n*9);
        System.out.println(n*10);

        sc.close();
    }
}
