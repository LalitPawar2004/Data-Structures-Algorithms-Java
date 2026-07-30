// Q. Write a program to store and print names in an array.
import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("How many student ?");
        int size = sc.nextInt();

        String[] name = new String [size];

        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }

        for(int i=0; i<name.length; i++){
            System.out.print(name[i] + ", ");
        }

        sc.close();
    }
}
