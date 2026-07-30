// Q. Write a program to find the minimum and maximum elements in an array.
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number ?");
        int size = sc.nextInt();

        int num[] = new int[size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=1; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }

            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Max => " + max);
        System.out.println("Min => " + min);
        sc.close();
    }
}
