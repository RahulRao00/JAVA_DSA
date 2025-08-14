package src.WEEK_5_Recursion;
import java.util.Scanner;

public class L2_Print {

    // {If We change work and Call then the output reverse }
    public static void print(int n) {
        if (n == 0) return;     // Base case
        System.out.println(n);  // Work
        print(n - 1);           // Call    
        System.out.println(n);  // Work
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        print(n);

    }
}
