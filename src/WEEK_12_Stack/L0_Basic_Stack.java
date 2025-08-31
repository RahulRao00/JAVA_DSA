package src.WEEK_12_Stack;

import java.util.Stack;

public class L0_Basic_Stack {
    public static void main(String[] args) {

        // creating a Stack provided in collection framework
        Stack<Integer> st = new Stack<>();
        st.push(10);  // push new element at the top the stack
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("Elements of the stack is : " +  st);
        st.pop();   // -> this is remove the top element from the stack
        System.out.println( "Element of the stack after removing the top element  : " + st);

        // peek()  ->  return the top element from the stack without removing the element
        System.out.println( "top element of the stack is : " + st.peek());

        // isEmpty() -> chack is the stack is empty or not
        System.out.println( "is Stack  empty: " + st.isEmpty());

        // size() -> size of the stack
        System.out.println( "Size of the stack is :  " + st.size());
    }
}
