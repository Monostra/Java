package repeat.classes_project.java_8;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Instrument {
    private int weight;

    public Instrument(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void play() {
        System.out.println("instrument play");
    }
}
