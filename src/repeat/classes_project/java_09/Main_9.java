package repeat.classes_project.java_09;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Main_9 {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();

        sportCar.drive();
        sportCar.setNitro(true);
        sportCar.setAge(5);
        sportCar.setBrand("mers");
        sportCar.setColor("black");

        System.out.println(sportCar.toString());

    }
}
