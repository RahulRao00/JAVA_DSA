package src.WEEK_5_Recursion;
import java.util.Scanner;

public class L3_Sum {
    public static int sum(int n) {
        if (n == 0) return 0;
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.println( "Sum is : " + sum(n));

    }
}

