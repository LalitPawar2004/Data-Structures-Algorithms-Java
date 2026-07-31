// Q. Write a program to find the sum of each row in a 2D array.

import java.util.Scanner;

public class SumOfRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row => ");
        int row = sc.nextInt();
        System.out.println("Column => ");
        int col = sc.nextInt();

        int mat[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            int sum = 0;
            for(int j=0; j<col; j++){
                sum = sum + mat[i][j];
            }
            System.out.println("Row " + i + " => " + sum);
        }
        sc.close();
    }
}
