package src.WEEK_1_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L4_sorting {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the elements in the ArrayList : ");
        Scanner sc= new Scanner(System.in);
        int i = 0;
        while (i< 5) {
            arr.add(sc.nextInt());
            i++;
        }

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        

    }
}
