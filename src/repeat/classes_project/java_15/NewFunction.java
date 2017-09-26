package repeat.classes_project.java_15;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public interface NewFunction {
    int destination = 2;
    void smartParking();
    public abstract void smartDrive();
    default public void voiceStart(){
        System.out.println("start voice newF");
    }
    public void some();
}
