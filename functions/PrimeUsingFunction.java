// Q. Write a function to check if a number is prime.
import java.util.*;

public class PrimeUsingFunction {
    public static String prime(int n){
        boolean isPrime = true;
        if(n<2){
            isPrime = false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            return "prime";
        }else{
            return "Not Prime";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Number => ");
        int n = sc.nextInt();

        System.out.println(prime(n));

        sc.close();
    }
}
