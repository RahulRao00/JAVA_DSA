package src.WEEK_1__ARRAY.WEEK_1_ARRAY_2D;
import java.util.*;

public class L0_basic2D {
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

        // Printing the element of the matrix
        System.out.println("Elements are : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
