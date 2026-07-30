// Q. Check if a person is eligible to vote (age >= 18).
import java.util.Scanner;

public class VotingEligibility {
    public static void vote(int a){
        if(a>=18){
            System.out.println("Yes, You can Vote");
        }else{
            System.out.println("No, You can't Vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age => ");
        int age = sc.nextInt();

        vote(age);
        sc.close();
    }
}
