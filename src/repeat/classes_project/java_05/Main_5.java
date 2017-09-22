package repeat.classes_project.java_05;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Main_5 {
    public static void main(String[] args) {
        //composition
        Engine engine = new Engine(200);
        Auto auto = new Auto("mazda", engine);
        Auto auto1 = new Auto("bmw", new Engine(400));

        //agregation
        Boat boat = new Boat("yamaha");
        boat.setEngine(new Engine(250));
        boat.setEngine(engine);
    }
}
