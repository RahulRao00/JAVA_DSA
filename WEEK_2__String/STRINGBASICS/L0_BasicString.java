import java.util.*;
 public class L0_BasicString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // char ch[] = {'R','a','h','u','l'}; // character array
        // System.out.println(ch);
        // String str = new String("Rahul Rao "); // String created
        // System.out.println(str);

        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println(name);

        sc.nextLine();  // this consume the space or newline character left due to first string

        System.out.print("Enter your name : ");
        String name1 = sc.nextLine();
        System.out.println(name1);

        System.out.println("Length of the name is : "+ name1.length()); 

        String idx = "Rahul";
        // System.out.println(idx.indexOf('l'));
        String idx2 = "rahul";
        System.out.println(idx.compareTo(idx2));

    }
}


