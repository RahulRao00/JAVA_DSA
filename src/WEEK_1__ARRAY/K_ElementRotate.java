package src.WEEK_1__ARRAY;

import java.util.Scanner;

public class K_ElementRotate {

    public static void reversePart(int start, int end, int[] arr) {
        while (start <= end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter how many time you want to rotate array : ");
        int rotate = sc.nextInt();
        
        reversePart(0, arr.length-1-rotate, arr); 
        reversePart(arr.length-rotate, arr.length-1, arr); 
        reversePart(0, arr.length-1, arr);

        System.out.print("Elements of array after k element reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


