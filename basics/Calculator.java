// Q. Create a basic calculator to perform addition, subtraction, multiplication, and division.
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        int result;

        System.out.println("Enter Operation (+,-,*,/,%)");
        String c = sc.next();

        switch (c) {
            case "+":
                result = a+b;
                System.out.println("Addition : " + result);
                break;
            
            case "-":
                result = a-b;
                System.out.println("Subtraction : " + result);
                break;

            case "*":
                result = a*b;
                System.out.println("Multiplication : " + result);
                break;

            case "/":
                result = a/b;
                System.out.println("Divide : " + result);
                break;

            case "%":
                result = a%b;
                System.out.println("Modulo : " + result);
                break;
        
            default:
                System.out.println("Wrong Input");
                break;
        }



        sc.close();
    }
}
