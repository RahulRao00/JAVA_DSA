
class Test1 {

    int x, y;

    Test1() {

        // super();
        System.out.println("0- parameterized constructor of parent ");
        x = 100;
        y = 200;
    }

    Test1(int x, int y) {

        // super();
        System.out.println("Parametrized of parent ");
        this.x = x;
        this.y = y;
    }
}

class Test2 extends Test1 {
    int a, b;

    Test2() {
        this(9, 99);
        System.out.println("0-para of child ");
        this.a = 300;
        this.b = 400;
    }

    Test2(int a, int b) {

        // super();
        System.out.println("pare of child");
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }

}

public class L8_SuperThis {
    public static void main(String[] args) {

        Test2 t2 = new Test2();
        t2.display();

    }

}
