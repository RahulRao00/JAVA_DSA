package src.Week_8_OOP_java.Encapsulation;
import java.util.Scanner;

class BusinessMen {

    private float p;
    private float t;
    private float si;
    static private float r;

    static{
        r = 12.5f
    }

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan amount");
        p = sc.nextFloat();
        System.out.println("Enter the tenure ");
        t = sc.nextFloat();
    }

    public void calcInterest() {
        si = (p*t*r) / 100;
    }

    public void display() {
        System.out.println(si);
    }

}



public class L5_Static {
    
    BusinessMen b1 = new BusinessMen();
    b1.acceptInput();
    b1.calcInterest();
    b1.display();

    BusinessMen b2 = new BusinessMen();

}
