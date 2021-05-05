package Planes;

public class CargoPlane extends Plane{

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm carrying heavy cargo ");

    }

   /* public void takeCargo() {

        System.out.println("I'm carrying heavy cargo");
    }*/
}
