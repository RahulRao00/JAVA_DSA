package src.WEEK_3_SEARCHING.LineraSerach;


import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the Elements of the array : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }


        // find the value 5 in the given array
        for (int i = 0; i < 5; i++) {

            if (arr[i] == 5) {
                System.out.println(arr[i] + " is at index " + i);
                return;
            }

        }

    }

}
