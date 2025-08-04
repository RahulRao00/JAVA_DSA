import java.util.*;

public class L0_BasicException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value;
        int n;

        // handling exception using normal try-catch block 
        try {

            System.out.print("Enter integer value : ");
            value = sc.nextInt();
            System.out.print("Enter next value : ");
            n = sc.nextInt();

            int ans = value / n;
            System.out.println("After divison value is : " + ans);

        } catch (Exception e) {

            System.out.println("Something went wrong : ");

        }

        sc.close();
    }

}
