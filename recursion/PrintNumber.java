// Q. Write a recursive program to print numbers from 1 to N.
package recursion;

import java.util.Scanner;

public class PrintNumber {
    public static void printN(int a, int n){
        if(n==0){
            return;
        }

        System.out.println(a);
        printN(a+1, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;

        printN(a, n);
        sc.close();
    }
}
