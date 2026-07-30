// Q. Write a program to check if an array is sorted in ascending order.
import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number ?");
        int size = sc.nextInt();

        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.print("{ ");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + ", ");
            }
            System.out.print(" } is Sorted");
        } else {
            System.out.print("{ ");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + ", ");
            }
            System.out.print(" } is not Sorted");
        }

        sc.close();
    }
}
