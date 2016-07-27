package behavior.power;

/**
 * Created by Роман on 27.07.2016.
 */
public class ElectricalPower implements PowerConsumptionBehaviour {
    @Override
    public void consumePower() {
        System.out.println("Consume electricity as a source of power.");
    }
}
