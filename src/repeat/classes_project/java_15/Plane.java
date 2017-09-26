package repeat.classes_project.java_15;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public interface Plane extends Submarine{
    void fly(int howLongTime);

    default public void voiceStart() {
        System.out.println("start voice Plane");
    }
    public void some();
}
