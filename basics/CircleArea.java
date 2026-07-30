// Q. Calculate the area of a circle for a given radius.
import java.util.Scanner;

public class CircleArea {
    public static double area(int a){
        return Math.PI*a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius Of Circle => ");
        int r = sc.nextInt();

        System.out.println(area(r));
        sc.close();
    }
}
