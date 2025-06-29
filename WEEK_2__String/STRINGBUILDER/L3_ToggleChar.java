
// Q. Toggle the character lower case to upper and vice versa
import java.util.Scanner;

public class L3_ToggleChar {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int  i = 0; i < sb.length(); i++) {
            if( 65 <=  sb.charAt(i) && sb.charAt(i) <= 90) {
                sb.setCharAt(i,(char)(sb.charAt(i) + 32)); // change ASCII value 
            }
            else {
                sb.setCharAt(i , (char)(sb.charAt(i) - 32));
            }
        }
        System.out.println(sb);
    }
}
