
import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome : ");
        String palindrome = sc.nextLine();

        boolean ans = false;
        for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
            if (palindrome.charAt(i) == palindrome.charAt(j)) {
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        
        System.out.println("String is palindrome :  " + ans);
        

    }
}
