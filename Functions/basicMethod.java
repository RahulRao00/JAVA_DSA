// package Functions;

import java.util.*;

public class basicMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(name);

        greeting();  // calling function 

    }
    public static void greeting() {
        System.out.println("Hello ! this is Rahul : ");
        System.out.println("Method is called ! and return nothing ");
    }
}
