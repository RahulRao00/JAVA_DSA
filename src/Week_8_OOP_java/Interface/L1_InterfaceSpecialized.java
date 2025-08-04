

interface Calculator {

    void add();
    void sub();

}

class MyCalculator implements Calculator{

    public void add() {
        System.out.println(10+202);
    }

    public void sub() {
        System.out.println(20-10);
    }

    public void mul(){
        System.out.println(10*20);
    }
}



public class L1_InterfaceSpecialized {
    
    public static void main(String[] args) {
        

        Calculator m = new MyCalculator();
        m.add();
        m.sub();

        // down casting parent int child type  
        ((MyCalculator) m).mul();

    }


}
