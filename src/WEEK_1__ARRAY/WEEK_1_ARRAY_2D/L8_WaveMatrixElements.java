package src.WEEK_1__ARRAY.WEEK_1_ARRAY_2D;
import java.util.Scanner;

public class L8_WaveMatrixElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row of the matrix : ");
        int n = sc.nextInt();
        System.out.print("Enter the no of columns of the matrix : ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        System.out.print("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix  is  : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t ");
            }
            System.out.println();
        }

        System.out.println("Matrix in the wavy form : ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
