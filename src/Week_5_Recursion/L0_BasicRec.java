package src.WEEK_5_Recursion;
import java.util.*;
public class L0_BasicRec {

    public static int fact( int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println( "Factorial is : " + fact(n));
    }
}
