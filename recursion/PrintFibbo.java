// Q. Write a recursive program to print Fibonacci numbers.
package recursion;

import java.util.Scanner;

public class PrintFibbo {
    public static void printFibbo(int a, int b, int n){
        if(n==0){
            return;
        }

        int sum = a + b;
        System.out.println(sum);

        printFibbo(b, sum, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        printFibbo(a, b, n-2);
        sc.close();
    }
}
