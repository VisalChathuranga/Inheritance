public class Vehicle {
    void drive(){
        System.out.println("Driving!");
    }
    void vehicleBreak(){
        System.out.println("Breaking!");
    }
    void reverse(){
        System.out.println("Reversing!");
    }
}
class Car extends Vehicle {
    void motorRace(){
        System.out.println("Racing!");
    }
}
class ModernCar extends Car{
    void fly(){
        System.out.println("Flying!");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("Surfing!");
    }
}
class ModernBoat extends Boat{
    void LandRide(){
        System.out.println("Riding!");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar mc = new ModernCar();
        ModernBoat mb = new ModernBoat();
        mc.drive();
        mc.vehicleBreak();
        mc.reverse();
        mc.motorRace();
        mc.fly();
        mb.drive();
        mb.vehicleBreak();
        mb.reverse();
        mb.surf();
        mb.LandRide();
    }
}





