package linkedList;

import java.util.LinkedList;

public class SearchElement {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        num.add(1);
        num.add(5);
        num.add(7);
        num.add(3);
        num.add(8);
        num.add(2);
        num.add(3);

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == 7) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}
