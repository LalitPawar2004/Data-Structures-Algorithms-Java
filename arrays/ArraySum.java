// Q. Write a program to calculate the sum of all elements in an array.
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number ?");
        int size = sc.nextInt();

        int num[] = new int[size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<num.length; i++){
            sum = sum + num[i];
        }

        System.out.println("Sum => " + sum);
        sc.close();
    }
}
