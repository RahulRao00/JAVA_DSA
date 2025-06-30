package src.WEEK_1_ARRAY_2;
import java.util.Scanner;

public class L8_sort_0_1_2_ {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int counter0 = 0;
        int counter1 = 0; 
        int counter2 = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 0) counter0++;
            if(arr[i] == 1) counter1++;
            if(arr[i] == 2) counter2++;
        }
        for(int i = 0; i<arr.length; i++){
            if(i<counter0) arr[i] = 0;
            else if(i < counter0 + counter1) arr[i] = 1;
            else arr[i] = 2;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
