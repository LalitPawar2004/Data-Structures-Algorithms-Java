// Q. Write a program to find the average of elements in an array.
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number ?");
        int size = sc.nextInt();

        int num[] = new int[size];
        
        int sum = 0;
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        
        int avg = sum/size;

        System.out.println("Average => " + avg);
        sc.close();
    }
}