package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteGreaterThan25 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Add number in Range of 1 - 50");

        for(int i=0; i<size; i++){
            int n = sc.nextInt();
            num.add(n);
        }

        for(int i=0; i<num.size(); i++){
            if(num.get(i) > 25){
                num.remove(i);
                i--;
            }
        }

        System.out.println(num);
        sc.close();
    }
}
