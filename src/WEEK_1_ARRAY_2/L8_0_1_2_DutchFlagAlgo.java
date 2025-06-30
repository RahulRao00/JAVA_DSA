package src.WEEK_1_ARRAY_2;
import java .util.*;
         // M:2:  Dutch flag Algorithm 
        //  All the operations on the mid, 
        // before low all Zeros & after hig all the 2

public class L8_0_1_2_DutchFlagAlgo {
    public static void main(String[] args) {
        
        int[] arr = { 0,1,2,0,1,2,1,2,0,0};
            int low = 0;
            int mid = 0; 
            int hig = arr.length -1;

            while (mid <= hig) { 
                if( arr[mid] == 0) {    // swap arr[mid] & arr[low]
                    int temp =  arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                }
                else if(arr[mid] == 1) mid++;
                else {                  // swap arr[mid] & arr[hig] for mid ==2
                    int temp =  arr[mid];
                    arr[mid] = arr[hig];
                    arr[hig] = temp;
                    hig--;
                    // mid++;
                }
            }

            for(int i : arr) {
                System.out.print(i + " ");
            }
        }
}
