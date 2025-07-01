package src.WEEK_4_Sorting;
import java.util.Scanner;
public class L3_InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.print("Enter the Element of the Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output : ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
