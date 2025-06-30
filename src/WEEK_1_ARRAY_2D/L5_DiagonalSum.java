package src.WEEK_1_ARRAY_2D;
import java.util.*;
public class L5_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row of the matrix : ");
        int n = sc.nextInt();
        System.out.print("Enter the no of columns of the matrix : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.print("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
        
        int sumD1 = 0;
        int sumD2 = 0;
        // Sum of primary diagonal elements
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            sumD1 += matrix[i][j];
        }
        for (int i = 0, j = matrix[0].length - 1; i < matrix.length; i++, j--) {
            if (i == j) {
                continue;
            } else {
                sumD2 += matrix[i][j];
            }
        }
        int diagonalSum = sumD1 + sumD2;
        System.out.print("Sum of the Diagonal elements is : " + diagonalSum);

    }
}





