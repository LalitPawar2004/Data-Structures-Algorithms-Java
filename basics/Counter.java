// Q. Write a simple counter program.
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Number you want?");
        int n = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=1; i<=n; i++){
            System.out.print("Enter number " + i + " => ");
            int a = sc.nextInt();

            if(a >= 1){
                positive++;
            }else if ( a < 1 && a < 0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.println("________________________________");
        System.out.println("Positive Number => " + positive);
        System.out.println("Negative Number => " + negative);
        System.out.println("Zero => " + zero);
        sc.close();
    }
}
