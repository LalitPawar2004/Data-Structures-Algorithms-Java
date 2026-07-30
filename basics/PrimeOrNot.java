// Q. Check if a given number is a prime number or not.
import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean isPrime = true;

        if(a<2){
            isPrime = false;
        }else{
            for(int i=2; i<=Math.sqrt(a); i++){
                if(a%i == 0){
                    isPrime = false;
                    break;
                }else{
                    isPrime = true;
                }
            }
        }

        if(isPrime){
            System.out.println(a + " is Prime");
        }else{
            System.out.println(a + " is not prime");
        }

        sc.close();
    }
}
