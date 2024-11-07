import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            } else
                max = arr[i];
        }
        System.out.println("Maximum element is : " + max);

        sc.close();
    }
}
