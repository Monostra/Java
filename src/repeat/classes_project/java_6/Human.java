package repeat.classes_project.java_6;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Human {
    private Hands hands = new Hands();
    private Legs legs = new Legs();

    public void clapping() {
        hands.clapping();
    }

    public void jumping() {
        legs.jumping();
    }
}
