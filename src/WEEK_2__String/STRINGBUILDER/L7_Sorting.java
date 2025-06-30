package src.WEEK_2__String.STRINGBUILDER;
import java.util.*;
public class L7_Sorting {

    public static void main(String[] args) {
        
        String name = "Rahul";
        char ch[] = name.toCharArray();
        System.out.println(ch);

        Arrays.sort(ch);
        System.out.println(ch);
        
        StringBuilder sb = new StringBuilder("RahulRao");
        char c[] = sb.toString().toCharArray();
        Arrays.sort(c);
        System.out.println(c);


        // ---------------------------

        // String Array -> kind of 2-D Array 
        String[] arr = {"Rahul", "Rao", "Hi", "Hello"};
        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

