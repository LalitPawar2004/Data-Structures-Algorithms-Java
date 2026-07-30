// Q. Write a program to count the occurrence of elements in an array.
import java.util.Scanner;

public class ArrayCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Number ?");
        int size = sc.nextInt();

        int num[] = new int [size];

        int odd = 0;
        int even = 0;

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
            if(num[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Odd Number => " + odd);
        System.out.println("Even Number => " + even);

        sc.close();
    }
}