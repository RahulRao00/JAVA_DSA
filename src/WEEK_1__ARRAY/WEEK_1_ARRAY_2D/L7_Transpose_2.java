package src.WEEK_1__ARRAY.WEEK_1_ARRAY_2D;
import java.util.*;
public class L7_Transpose_2 {
    // Q. Transpose of matrix in the same matrix only valid for square matrix
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the elements of the 3*3 matrix: " );
            int[][] arr = new int[3][3];
    
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
    
            
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]  + " ");
                }
                System.out.println();
            }
    
            // Transpose logic 
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j <= i; j++) {
                  int temp = arr[i][j];
                  arr[i][j] = arr[j][i];
                  arr[j][i] = temp;
                }
            }
    
            System.out.println("Matrix after the transpose : ");
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }


