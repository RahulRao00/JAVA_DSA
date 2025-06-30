package src.WEEK_2__String.STRINGBUILDER;
import java.util.Scanner;

public class L1_basicBuilder {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String : ");

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        
        String s = sc.nextLine();
        StringBuilder inp = new StringBuilder(s);
        System.out.println(inp);

        for(char ch = 'a'; ch < 'z'; ch++ ) {
            sb.append(ch);
        }
        System.out.println(sb);

    }
}

