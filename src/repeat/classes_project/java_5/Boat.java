package repeat.classes_project.java_5;

/**
 * Created by Mykhailo on 18/09/2017.
 * agregation
 */
public class Boat {
    private String brand;
    private Engine engine;

    public Boat() {
    }

    public Boat(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
