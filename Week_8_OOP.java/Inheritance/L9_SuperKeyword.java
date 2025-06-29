
class Demo1 {
    int x = 100;
}

class Demo2 extends Demo1 {

    int x = 200;

    void display() {
        // super refer to the parent class 
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class L9_SuperKeyword {

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.display();

    }
}
