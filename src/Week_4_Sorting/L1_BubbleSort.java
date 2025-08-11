package src.WEEK_4_Sorting;


import java.sql.SQLOutput;

public class L1_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 7, 9, 10, 23, 6, 0, 1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[i + 1]) {
                    int mid = arr[i];

                }
            }
        }
        System.out.println("Array after the sorting : ");
        for(int val : arr) {
            System.out.println(val + " ");
        }
    }
}





