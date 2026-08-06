package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            int n = sc.nextInt();
            num.add(n);
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.size(); i++){
            if(num.get(i)>max){
                max = num.get(i);
            }
        }

        System.out.println(max);
        sc.close();
    }
}
