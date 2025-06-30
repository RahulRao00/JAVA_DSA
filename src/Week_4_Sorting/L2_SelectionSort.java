package src.Week_4_Sorting;
import java.util.*;
public class L2_SelectionSort {
    public static void main(String[] args) {
        
        int arr[] = {2,4,8,9,1,-4,0,11};
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i< arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
        }
        System.out.println(min);
    }
}


