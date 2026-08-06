package arrayList;

import java.util.ArrayList;
import java.util.Scanner;;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int size = sc.nextInt();

        for(int i=0; i<size; i++){
            int n = sc.nextInt();
            num.add(n);
        }

        boolean isSorted = true;

        for(int i=0; i<num.size()-1; i++){
            if(num.get(i) > num.get(i+1)){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Ascending Sorted");
        }else{
            System.out.println("Not Ascending Sorted");
        }
        sc.close();
    }
}
