package repeat.classes_project.java_01;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Car {
    String brend;
    int maxSpeed;
    int kmPerLitr;
    int fuelOfTank;
    String color;
    String type;

    public Car() {
    }

    public Car(String brend, int maxSpeed, int kmPerLitr, int fuelOfTank, String color, String type) {
        this.brend = brend;
        this.maxSpeed = maxSpeed;
        this.kmPerLitr = kmPerLitr;
        this.fuelOfTank = fuelOfTank;
        this.color = color;
        this.type = type;
    }


    public void startEngine() {
        System.out.println("car start engine");
    }

    public void drive() {
        System.out.println("car drive");
    }

    public void parking() {
        System.out.println("car parking");
    }

    public void stop() {
        System.out.println("car stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", kmPerLitr=" + kmPerLitr +
                ", fuelOfTank=" + fuelOfTank +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void range() {
        int range = fuelOfTank * kmPerLitr;
        System.out.println("you can range " + range + "km");
    }

}
