package behavior.power;

/**
 * Created by Роман on 27.07.2016.
 */
public class SteamPower implements PowerConsumptionBehaviour {
    @Override
    public void consumePower() {
        System.out.println("Consume steam as a source of power.");
    }
}
