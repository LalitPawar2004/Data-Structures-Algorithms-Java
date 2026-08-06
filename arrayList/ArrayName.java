package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        
        int size = sc.nextInt();

        for(int i=0; i<size; i++){
            String str = sc.next();
            name.add(str);
        }

        for(int i=0; i<name.size(); i++){
            System.out.print(name.get(i) + " ");
        }
        sc.close();
    }
}
