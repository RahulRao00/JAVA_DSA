package src.Week_8_OOP_java.Inheritance;

// cyclic Inheritance not allowed 
class Demo1  extends Demo2 {

    void fun1()  {
        System.out.println("Inside fun1 ");
    }
}

class Demo2 extends Demo1 {

    void fun2() {
        System.out.println("Inside fun2");
    }
}

public class L5_CyclicInh {

    public static void main(String[] args) {

    }

}
