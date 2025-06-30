package src.WEEK_1_ARRAY_2;

import java.util.*;
public class L7_ZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements 0 and 1  of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (i < counter) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        // for(int i = counter; i<arr.length;i++){
        // arr[i] = 1;
        // }
        System.out.print("Array after sorted Zero's and One's ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
