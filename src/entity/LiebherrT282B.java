package entity;

import behavior.power.DieselPower;

/**
 * Created by Роман on 27.07.2016.
 */
public class LiebherrT282B extends Truck {
    public LiebherrT282B() {
        setWeight(544000);
        setWheelNumber(6);
        setPower(3500);
        setMaxPayloadWeight(363);
        setPowerConsumptionBehaviour(new DieselPower());

        System.out.println("A specimen of LiebherrT282B is produced.");
    }
}
