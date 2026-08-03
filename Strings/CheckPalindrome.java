// Q. Write a program to check whether a string is a palindrome.
package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
