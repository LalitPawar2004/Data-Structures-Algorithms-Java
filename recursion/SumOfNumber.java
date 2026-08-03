package recursion;

import java.util.Scanner;

public class SumOfNumber {
    public static void sumN(int sum, int n){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum + n;

        sumN(sum, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        sumN(sum, n);
        sc.close();
    }
}
