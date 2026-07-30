// Q. Calculate the power of a number (x^n).
import java.util.Scanner;

public class PowerCalculation {
    public static double power(int a, int b){
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(power(n1, n2));
        sc.close();
    }
}
