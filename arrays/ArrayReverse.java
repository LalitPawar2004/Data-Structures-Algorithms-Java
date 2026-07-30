// Q. Write a program to reverse an array.
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number ?");
        int size = sc.nextInt();

        int arr1[] = new int[size];

        for(int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[arr1.length];

        for(int i=arr1.length-1, j=0; i>=0; i--, j++){
            arr2[j] = arr1[i];
        }

        System.out.print("Reverse Array => ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
