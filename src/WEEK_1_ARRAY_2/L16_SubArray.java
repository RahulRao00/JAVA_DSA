package src.WEEK_1_ARRAY_2;
import java.util.Scanner;

public class L16_SubArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Pair of three subArrays : ");
        for (int i = 0; i < n - 2; i++) {
            System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
        }
    }
}
