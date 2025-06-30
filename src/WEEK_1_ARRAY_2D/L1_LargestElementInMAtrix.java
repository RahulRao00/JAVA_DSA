package src.WEEK_1_ARRAY_2D;
// package WEEK_1__2D_ARRAY;

import java.util.Scanner;

public class L1_LargestElementInMAtrix {

    // this calculate the maximum value in the matrix
    public static int largestElement(int matrix[][]) {
        int n = 3, m = 3;
        // int i = 0,j = 0;
        // int max = matrix[0][0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                if (max < matrix[i][j ]) {
                    max = matrix[i][j ];
                }
                // else{
                // max = matrix[i][j];
                // }
            }
        }
        
        return max;
    }

    // this calculate the minimum value in the matrix
    public static int smallestElement(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        // int i = 0,j = 0;
        // int min = matrix[0][0];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                if (min > matrix[i][j ]) {
                    min = matrix[i][j ];
                }
                // else{
                // min = matrix[i][j +1];
                // }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.print("Enter the elements of the matrix 3*3 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int ans = largestElement(matrix);
        System.out.println("Maximum element in the matrix is : " + ans);
        int ans1 = smallestElement(matrix);
        System.out.print("Minimum element in the matrix is : " + ans1);

    }
}
