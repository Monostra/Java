package repeat.classes_project.java_15;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public abstract class SportCar extends Auto implements NewFunction, Plane{
    private boolean turbo;

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "turbo=" + turbo +
                '}';
    }

    @Override
    public void voiceStart() {
        NewFunction.super.voiceStart();
    }
}
