package entity;

import behavior.movement.MovementUsingWheels;

/**
 * Created by Роман on 27.07.2016.
 */
public abstract class MotorVehicle extends Vehicle {
    private int wheelNumber;
    private int power;

    public MotorVehicle() {
        setMovementBehavior(new MovementUsingWheels());
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    /**
     * @param power horsepower
     */
    public void setPower(int power) {
        this.power = power;
    }
}
