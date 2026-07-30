// Q. Compare two numbers and find the largest.
import java.util.*;

public class CompareNumbers {
    public static void comp(int a, int b){
        if(a > b){
            System.out.println(a + " is greater than " + b);
        }else{
            System.out.println(b + " is greater than " + a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 => ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 => ");
        int n2 = sc.nextInt();

        comp(n1, n2);

        sc.close();
    }
}
