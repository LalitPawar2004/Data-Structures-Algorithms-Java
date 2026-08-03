// Q. Write a program to extract the username part from an email address.
package Strings;

import java.util.Scanner;

public class ExtractUsernameFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        
        String username = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                username = username + email.charAt(i);
            }
        }

        System.out.println("username => " + username);

        sc.close();
    }
}
