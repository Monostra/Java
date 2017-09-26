package repeat.classes_project.java_15;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public abstract class Sedan extends Auto{
    private double badSize;

    public double getBadSize() {
        return badSize;
    }

    public void setBadSize(double badSize) {
        this.badSize = badSize;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "badSize=" + badSize +
                '}';
    }
}
