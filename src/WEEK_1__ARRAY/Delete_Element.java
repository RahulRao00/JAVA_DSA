package src.WEEK_1__ARRAY;

import java.util.*;

public class Delete_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want ot delete : ");
        int del = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == del) {
                for (int j = i; j < arr.length; j++) {
                    arr[i] = arr[i + 1];
                }
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
