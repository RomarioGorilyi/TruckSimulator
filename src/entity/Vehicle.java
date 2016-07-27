package entity;

import behavior.movement.MovementBehavior;
import behavior.power.PowerConsumptionBehaviour;

/**
 * Created by Роман on 27.07.2016.
 */
public abstract class Vehicle {
    private PowerConsumptionBehaviour powerConsumptionBehaviour;
    private MovementBehavior movementBehavior;
    private int weight;
    private boolean isMoving;

    public void setPowerConsumptionBehaviour(PowerConsumptionBehaviour powerConsumptionBehaviour) {
        this.powerConsumptionBehaviour = powerConsumptionBehaviour;
    }

    public void setMovementBehavior(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }

    /**
     * Set weight of a vehicle
     * @param weight weight of a vehicle in kilos
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  void performMovement() {
        powerConsumptionBehaviour.consumePower();
        movementBehavior.move();
    }

    public void startMoving() {
        if (isMoving) {
            throw new IllegalStateException("Error. You've already started behavior.power.movement.\n");
        } else {
            isMoving = true;
            System.out.println("Start moving...");
        }
    }

    public void stopMoving() {
        if (isMoving) {
            isMoving = false;
            System.out.println("Stop moving...");
        } else {
            throw new IllegalStateException("Error. You've already stopped.");
        }
    }
}