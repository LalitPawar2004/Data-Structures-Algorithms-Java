// Q. Write a program to calculate the total length of multiple string inputs.
package Strings;

import java.util.Scanner;

public class CumulativeStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String arr[] = new String[size];

        int length = 0;
        for(int i=0; i<size; i++){
            arr[i] = sc.next();
            length = length + arr[i].length();
        }

        System.out.println(length);

        sc.close();
    }
}