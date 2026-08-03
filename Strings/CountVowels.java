// Q. Write a program to count vowels in a string.
package Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        int vowel = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch == 'u'){
                vowel++;
            }
        }

        System.out.println(vowel);
        sc.close();
    }
}
