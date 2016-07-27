package entity;

/**
 * Created by Роман on 27.07.2016.
 */
public abstract class Truck extends MotorVehicle{
    private int maxPayloadWeight;

    /**
     * @param maxPayloadWeight maximum payload capacity in tons
     */
    public void setMaxPayloadWeight(int maxPayloadWeight) {
        this.maxPayloadWeight = maxPayloadWeight;
    }

    public void transportCargo() {
        System.out.println("Transporting cargo...");
    }
}
