
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

public class example {
    public static void main(String[] args) {

        // Plane ref ;

        // ref = new CargoPlane();
        // ref = new PassengerPlane();
        // ref = new FighterPlane();

        // ref.fly();
        // ref.takeoff();
        // ref.lnad();

        // Array of parent references pointing to child objects
        Plane planes[] = {
                new CargoPlane(),
                new FighterPlane(),
                new PassengerPlane()
        };

        // planes[0].fly();
        // planes[1].fly();

        // Loop using parent reference – full runtime polymorphism
        for (Plane plane : planes) {
            plane.fly();
            plane.takeOff();
            plane.land();


            // If you want to call specific method → use type casting
            if (plane instanceof CargoPlane) {

                ((CargoPlane) plane).carryCargo();
            } 
            else if (plane instanceof FighterPlane) {

                ((FighterPlane) plane).carryWeapon();
            } 
            else {
                
                ((PassengerPlane) plane).carryPassenger();
            }

        }

    }
}
