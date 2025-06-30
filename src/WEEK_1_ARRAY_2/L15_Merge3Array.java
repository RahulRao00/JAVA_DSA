package src.WEEK_1_ARRAY_2;
import java.util.Scanner;

public class L15_Merge3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Array
        System.out.print("Enter the length of the first Array : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second Array
        System.out.print("Enter the length of the Second Array : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Third Array
        System.out.print("Enter the length of the Third Array : ");
        int n3 = sc.nextInt();
        int arr3[] = new int[n3];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        // Resultant Array
        int k = 0;
        int res[] = new int[n1 + n2 + n3];
        int i = 0;

        while (i < res.length) {
            if (i < arr1.length) {
                res[k++] = arr1[i];
            }
            if (i < arr2.length) {
                res[k++] = arr2[i];
            }
            if (i < arr3.length) {
                res[k++] = arr3[i];
            }
            i++;
        }

        System.out.print("Array after merge ");
        for (int j = 0; j < k; j++) {
            System.out.print(res[j] + " ");
        }

    }
}
