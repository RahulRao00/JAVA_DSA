package src.Week_5_Recursion;
import java.util.Scanner;
public class L4_Pow {
    
    public static int pow(int a, int b){  // TC O(b)
        if( b == 0) return 1;
        return a*pow(a, b-1);   // work + call()
    }

    public static long pow2(int a, int b){  //TC O(log b)
        if( b == 0) return 1;
        long ans = pow2(a, b/2);
         if(b%2 ==0) return ans*ans;   
        else return ans*ans*a;   
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter base a : ");
        int a = sc.nextInt();
        System.out.print("Enter power b : ");
        int b = sc.nextInt();
        long ans = pow2(a, b);
        System.out.println( "Square is: " + ans);

    }
}
