package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            int n = sc.nextInt();
            num.add(n);
        }

        while(!num.isEmpty()){
            num.addFirst(num.removeFirst());
        }

        System.out.println(num);
        sc.close();
    }
}
