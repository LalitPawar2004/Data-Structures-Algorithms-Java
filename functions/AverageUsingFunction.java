// Q. Write a function to calculate the average of numbers.
import java.util.*;

public class AverageUsingFunction {
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println(avg(n1, n2, n3));
        sc.close();
    }
}