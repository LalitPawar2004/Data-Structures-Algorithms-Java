// Q. Write a program to take input for a 2D array and print it in row-wise format.

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row => ");
        int row = sc.nextInt();
        System.out.print("Column => ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for(int i=0; i <row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
