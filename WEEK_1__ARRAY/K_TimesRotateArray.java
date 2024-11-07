import java.util.Scanner;

public class K_TimesRotateArray {
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
        reversePart(0, 4, arr);
        reversePart(5, 6, arr);
        reversePart(0, 6, arr);



        System.out.print("Elements of array after k element reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}