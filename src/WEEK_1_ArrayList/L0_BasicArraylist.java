package src.WEEK_1_ArrayList;
import java.util.*;
public class L0_BasicArraylist {
        public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(0,10);  // arr[0] = 1 
        arr.add(1,20);  // arr[1] = 2
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);

        for(int i = 0; i < 5; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(arr);
        System.out.print("Length of the arraylist is : " +arr.size());

        ArrayList<Integer> brr = new ArrayList<>();
        brr.add(10);
        brr.add(20);
        brr.add(30);
        brr.add(40);
        brr.add(50);
        System.out.println(brr);

        }
    }


