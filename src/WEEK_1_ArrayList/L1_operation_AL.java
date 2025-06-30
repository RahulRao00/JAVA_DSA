package src.WEEK_1_ArrayList;
import java.util.*;
public class L1_operation_AL {
        
        public static void main(String[] args) {
            ArrayList<Integer> brr = new ArrayList<>();

            brr.add(10);  // operation - O(1) 
            brr.add(20);
            brr.add(30);
            brr.add(40);
            System.out.print(brr);

            // Get Element
             int a = brr.get(0);
            System.out.println(a);

            // Delete element 
            brr.remove(2);        
            System.out.println(brr);

            // Set 
            brr.set(2, 100);
            System.out.println(brr);
  

        }
    }
  