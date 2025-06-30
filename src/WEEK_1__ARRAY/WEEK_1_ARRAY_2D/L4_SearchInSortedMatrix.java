package src.WEEK_1__ARRAY.WEEK_1_ARRAY_2D;

import java.util.*;

public class L4_SearchInSortedMatrix {
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
    }
}