import java.util.Scanner;

public class L1_numberPrint {

    // This will print the numbers form N to one 
    public static void NtoOne(int n) {
        if (n == 0) return;      // Base case
        System.out.println(n);   // Work
        NtoOne(n - 1);           // Call
    }

    // This will print the numbers from 1 to N 
    // { Using Global variable n  _OR_  Passing Extra Variable in the Method for the Base Condition  }
    public static void OneToN(int x, int n) {
        if( x > n) return;       // Base Case
        System.out.println(x);   // Work
        OneToN(x+1 , n);           // Call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        NtoOne(n);
        OneToN(1 , n);
    }
}
