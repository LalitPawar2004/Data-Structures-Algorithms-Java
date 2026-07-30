// Q. Write a function to check if a number is even.
import java.util.*;

public class EvenUsingFunction {
    public static boolean even(int n){
        return n%2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number => ");
        int n = sc.nextInt();

        if(even(n)){
            System.out.println(n + " " + "is even number");
        }else{
            System.out.println(n + " " + "is not even number");
        }

        sc.close();
    }
}
