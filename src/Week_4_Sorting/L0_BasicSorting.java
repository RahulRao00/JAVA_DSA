package src.WEEK_4_Sorting;
import java.lang.reflect.Array;
import java.util.Arrays;

public class L0_BasicSorting {

    // Sorting in built  Methods
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,3,10,22,56,78};
       
        // System.out.println(Arrays.sort(arr));
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}





