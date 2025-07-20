// package src.WEEK_8_OOP_java.Polymorphism;


class Plane {

    void takeOff() {
        System.out.println("Plane is taking off.... ");
    }

    void fly() {
        System.out.println("Plane is flying... ");
    }

    void land() {
        System.out.println("Plane is landing... ");
    }

}

class CargoPlane extends Plane {

    void fly() {
        System.out.println("Cargo is Flying at Low Height... ");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargos...");
    }
}

class PassengerPlane extends Plane {

    void fly() {
        System.out.println("Passenger fly at the Medium height... ");
    }

    void carryPassenger() {
        System.out.println("PassengerPlane is  carrying Passenger....   ");
    }

}

class FighterPlane extends Plane {

    void fly() {
        System.out.println("Fighter Planes fly at very high Height...");

    }

    void carryWeapon() {
        System.out.println("Fighter Plane is carrying Weapons... ");
    }
}

class Airport {

    // this method is loosely coupled work for different parameters, true polymorphism 
    void permit( Plane ref) {

        ref.fly();
        ref.land();
        ref.takeOff();
        System.out.println();

    }
}

 public class L3_CompletePolymorphism {
    public static void main(String[] args) {

    //    tightly coupled 
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        PassengerPlane pp = new PassengerPlane();

        Airport ap = new Airport();
        ap.permit(cp);
        ap.permit(pp);
        ap.permit(fp);
     

        
    }
}


