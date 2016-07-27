import entity.Caterpillar797F;
import entity.LiebherrT282B;
import entity.Truck;

/**
 * Created by Роман on 27.07.2016.
 */
public class TruckSimulator {
    public static void main(String[] args) {
        Truck caterpillar = new Caterpillar797F();
        caterpillar.performMovement();
        caterpillar.transportCargo();
        caterpillar.startMoving();
        //caterpillar.startMoving();
        caterpillar.stopMoving();
        //caterpillar.stopMoving();

        Truck liebherr = new LiebherrT282B();
    }
}
