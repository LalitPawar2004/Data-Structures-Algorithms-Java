// Q. Print all even numbers up to N.
public class EvenNumbersTillN {
    public static void main(String[] args) {
        int n = 17;

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
