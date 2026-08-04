package recursion;

public class PrintEvenReverse {
    public static void printEvenReverse(int n){
        if(n <= 0){
            return;
        }

        if(n%2 == 0){
            System.out.println(n);
        }

        printEvenReverse(n-1);
    }

    public static void main(String[] args) {
        int n = 7;

        printEvenReverse(n);
    }
}
