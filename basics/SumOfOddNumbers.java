// Q. Find the sum of all odd numbers up to N.
import java.util.*;

public class SumOfOddNumbers {
    public static int sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number => ");
        int n = sc.nextInt();

        System.out.println(sum(n));
        sc.close();
    }
}
