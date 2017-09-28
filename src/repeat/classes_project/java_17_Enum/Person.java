package repeat.classes_project.java_17_Enum;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public class Person {
    private Transport transport;

    public void toGo(Transport transport) {
        System.out.println("go by " + transport.name());
    }
}
