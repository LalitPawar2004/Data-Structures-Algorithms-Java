// Q. Write a recursive program to calculate the factorial of a number.
package recursion;

import java.util.Scanner;

public class CalcFact {
    public static int calcFac(int n){
        if(n==0){
            return 1;
        }
        return n * calcFac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(calcFac(n));

        sc.close();
    }
}
