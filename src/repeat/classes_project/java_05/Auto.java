package repeat.classes_project.java_05;

/**
 * Created by Mykhailo on 18/09/2017.
 * composition
 */
public class Auto {
    private String brand;
    private Engine engine;

    public Auto() {
    }

    public Auto(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
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
