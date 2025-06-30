package src.WEEK_1_ARRAY_2D;

import java.util.Scanner;

public class L3_SearchInMatrix {

    public static void searchElement(int matrix[][], int target) {

        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element is at index  : (" + i + " " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found ");
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
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        searchElement(matrix, target);

    }
}
