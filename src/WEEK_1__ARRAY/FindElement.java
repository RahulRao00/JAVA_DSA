package src.WEEK_1__ARRAY;

import java.util.*;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element that you want to search in the array : ");
        int target = sc.nextInt();
        int ans = search(arr, target);
        if (ans == -1)
            System.out.println("Element not found in the array ");
        else
            System.out.println("At index : " + ans);
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
