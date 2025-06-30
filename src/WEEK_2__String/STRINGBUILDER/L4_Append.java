package src.WEEK_2__String.STRINGBUILDER;
import java.util.Scanner;

public class L4_Append {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hi ");
        sb.append("Rahul");
        System.out.println(sb);
        sb.append(100);
        char[] ch = {'c', 'a', 'r'};
        sb.append(ch);
        System.out.println(sb); 

        sb.append(111);
        System.out.println(sb);

        StringBuilder next = new StringBuilder(" Next");
        sb.append(next);
        System.out.println(sb);
    }
}
