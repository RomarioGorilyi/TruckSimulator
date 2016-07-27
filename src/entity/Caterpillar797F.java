package entity;

import behavior.power.DieselPower;

/**
 * Created by Роман on 27.07.2016.
 */
public class Caterpillar797F extends Truck {
    public Caterpillar797F() {
        setWeight(623700);
        setWheelNumber(6);
        setPower(4000);
        setMaxPayloadWeight(363);
        setPowerConsumptionBehaviour(new DieselPower());

        System.out.println("A specimen of Caterpillar797F is produced.");
    }
}