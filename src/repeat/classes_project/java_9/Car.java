package repeat.classes_project.java_9;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public abstract class Car {
    private String brand;
    private String color;
    private int age;

    public void startEngine() {
        System.out.println("start engine");
    }

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
