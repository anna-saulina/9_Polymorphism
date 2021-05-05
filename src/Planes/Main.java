package Planes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static Planes.FlayingDevice.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<FlayingDevice> ufo = new ArrayList<FlayingDevice>();
        ufo.add(new Plane());
        ufo.add(new CargoPlane());
        ufo.add(new SuperSonic());

        for(FlayingDevice fDevice : ufo) {
            fDevice.fly();
        }
    }
}
