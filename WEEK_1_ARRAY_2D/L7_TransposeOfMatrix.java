import java.util.Scanner;
public class L7_TransposeOfMatrix {

    // Q. Transpose of matrix in new matrix 
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
        
        // printing the Elements of matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }

        // ..............
        int transpose[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // printing the Elements of Transpose matrix
        System.out.println("Matrix after transpose : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + "\t ");
            }
            System.out.println();
        }

    }
}
