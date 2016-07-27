package behavior.power;

/**
 * Created by Роман on 27.07.2016.
 */
public class DieselPower implements PowerConsumptionBehaviour {
    @Override
    public void consumePower() {
        System.out.println("Consume diesel as a source of power.");
    }
}
