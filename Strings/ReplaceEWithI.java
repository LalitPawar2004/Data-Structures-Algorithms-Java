// Q. Write a program to replace all occurrences of 'e' with 'i' in a string.
package Strings;

import java.util.Scanner;

public class ReplaceEWithI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();

        String result = "";
        for(int i=0; i<original.length(); i++){
            if(original.charAt(i) == 'e'){
                result = result + 'i';
            }else{
                result = result + original.charAt(i);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
