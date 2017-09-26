package repeat.classes_project.java_15;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public abstract class Auto {
    private String brand;
    private int age;

    public void startEngine() {
        System.out.println("start engine");
    }

    public abstract void drive();
    public abstract void stop();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", age=" + age +
                '}';
    }
}
