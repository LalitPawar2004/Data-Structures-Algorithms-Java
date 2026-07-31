// Q. Write a program to find the sum of each column in a 2D array.

public class SumOfColumn {
    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i=0; i<mat.length; i++){
            int sum = 0;
            for(int j=0; j<mat[i].length; j++){
                sum = sum + mat[j][i];
            }
            System.out.println("Sum Of Column " + (i+1) + " => " + sum);
        }
    }
}
