package behavior.power;

/**
 * Created by Роман on 27.07.2016.
 */
public class PatrolPower implements PowerConsumptionBehaviour {
    @Override
    public void consumePower() {
        System.out.println("Consume patrol as a source of power.");
    }
}
