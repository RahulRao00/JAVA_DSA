package src.WEEK_12_Stack;

import java.util.Scanner;
import java.util.Stack;

public class L1_Move_Elements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        System.out.println("Enter the no of element you want to push in the stack: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the stack: ");

        for( int i =0; i < n; i++ ) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Present elements in the stack: " + st);

    }
}
