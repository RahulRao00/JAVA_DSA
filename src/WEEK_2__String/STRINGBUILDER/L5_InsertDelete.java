package src.WEEK_2__String.STRINGBUILDER;
import java.util.*;

public class L5_InsertDelete {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Rahul  Rao");
        sb.insert(0,"hi");
        System.out.println(sb);

        sb.delete(5, 10);
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);

    }
}
