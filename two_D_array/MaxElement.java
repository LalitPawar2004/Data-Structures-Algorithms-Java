// Q. Write a program to find the maximum element in a 2D array.

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row => ");
        int row = sc.nextInt();
        System.out.print("Column => ");
        int col = sc.nextInt();

        int mat[][] = new int[row][col];


        int max = Integer.MIN_VALUE;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = sc.nextInt();

                if(mat[i][j] > max){
                    max = mat[i][j];
                }
            }
        }

        System.out.println("Maximum Element => " + max);
        sc.close();
    }
}
