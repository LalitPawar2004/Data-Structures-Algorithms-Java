// Question: Print all odd numbers from 1 to n using recursion.
package recursion;

public class PrintOddNumbers {
    public static void printOdd(int current, int n){
        if(current > n){
            return;
        }

        System.out.println(current);
        printOdd(current+2, n);
    }

    public static void main(String[] args) {
        int n = 7;
        int current = 1;

        printOdd(current, n);
    }
}
