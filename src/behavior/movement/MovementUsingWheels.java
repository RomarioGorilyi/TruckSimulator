package behavior.movement;

/**
 * Created by Роман on 27.07.2016.
 */
public class MovementUsingWheels implements MovementBehavior {
    @Override
    public void move() {
        System.out.println("Move exploiting wheels.");
    }
}
