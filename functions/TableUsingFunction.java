// Q. Write a function to print the multiplication table of a number.
import java.util.*;

public class TableUsingFunction {
    public static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number => ");
        int n = sc.nextInt();

        table(n);

        sc.close();
    }
}
