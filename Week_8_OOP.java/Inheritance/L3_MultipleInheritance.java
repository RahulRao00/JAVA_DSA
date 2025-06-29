// Multiple inheritance in not allowed 
class Demo1 {
    void fun1() {

    }
}

class Demo2 extends Demo1 {

    void fun2() {

    }
}

class Demo3 extends Demo1, Demo2 {
   void fun3();
}



public class L3_MultipleInheritance {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
    }
    
}
