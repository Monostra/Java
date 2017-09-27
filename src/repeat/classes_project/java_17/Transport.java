package repeat.classes_project.java_17;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public enum Transport {

    CAR(200), TRAIN(80), PLANE(800), TRUCK(60), BUS(70), HORSE(40), BIKE(35),;

    private int maxSpeed;

    Transport(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
