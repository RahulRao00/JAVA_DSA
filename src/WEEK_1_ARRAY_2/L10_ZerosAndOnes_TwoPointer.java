package src.WEEK_1_ARRAY_2;

import java.util.*;
public class L10_ZerosAndOnes_TwoPointer {

    // public static void swap(int i,int j) {
    // int temp = j;
    // j = i;
    // i = temp;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[j] == 1) j--;
            else if (arr[i] == 0) i++;
            //  if (i > j)
            //     break;
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            } // swap(i,j);
        }

        System.out.print("After sorted array is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        
    }
}
