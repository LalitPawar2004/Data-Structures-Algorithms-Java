// Q. Write a program to search for a specific element in an array.
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number ?");
        int size = sc.nextInt();

        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Search ? ");
        int search = sc.nextInt();

        boolean isFound = false;

        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                isFound = true;
                index = i;
                break;
            }
        }

        if (isFound) {
            System.out.println("Number found at Index " + index);
        } else {
            System.out.println("Cannot found");
        }
        sc.close();
    }

}
