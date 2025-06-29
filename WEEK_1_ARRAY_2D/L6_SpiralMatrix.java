import java.util.*;
public class L6_SpiralMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;

        System.out.print("Enter the elements of the matrix 4*4 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        int min_row = 0;
        int max_row = matrix.length;
        int min_col = 0;
        int max_col = matrix[0].length;

        while ( min_col < max_col ) {

            // left to right
                for( int j = min_col; j< max_col; j++) {
                    System.out.print(matrix[min_row][j] + " ");
                }
                min_row++;

                // Top to bottom
                for( int i = min_row; i< max_row; i++) {
                    System.out.print(matrix[i][max_col-1] + " ");
                }
                max_col--;

                // right to left 
                for( int j = max_col-1; j >= min_col; j--) {
                    System.out.print(matrix[max_row-1][j] + " ");
                }
                max_row--;

                // bottom to top
                for( int i = max_row-1; i >= min_row; i--) {
                    System.out.print(matrix[i][min_col] + " ");
                }
                min_col++;
        }
    }
}

