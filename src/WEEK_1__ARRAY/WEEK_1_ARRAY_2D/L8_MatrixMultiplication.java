package src.WEEK_1__ARRAY.WEEK_1_ARRAY_2D;
import java.util.Scanner;

public class L8_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row of the matrix : ");
        int n = sc.nextInt();
        System.out.print("Enter the no of columns of the matrix : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        int matrix1[][] = new int[m][n];

        System.out.print("Enter the elements of the matrix1 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter the elements of the matrix2 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // printing the Elements of matrix 1
        System.out.println("Matrix 1 is  : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }

        // printing the elements of the matrix 2
        System.out.println("Matrix 2 is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix1[i][j] + "\t ");
            }
            System.out.println();
        }

        // multiplication 
        int multiplication[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    multiplication[i][j] += matrix[i][k] * matrix1[k][j];
                }
            }
        }
        
        System.out.println("Matrix after multiplication : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(multiplication[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}


