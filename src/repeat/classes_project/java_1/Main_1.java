package repeat.classes_project.java_1;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Main_1 {
    public static void main(String[] args) {
        Car mers = new Car();

        mers.brend = "Mersedes";
        mers.color = "black";
        mers.type = "sport";
        mers.fuelOfTank = 10;
        mers.kmPerLitr = 10;

        mers.range();

        Car sportCar = new Car("Mclaren", 400, 25, 90, "yellow", "sport");
        System.out.println(sportCar.toString());
    }
}
