package repeat.classes_project.java_11;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Trailer {
    private String type;
    private int weight;

    public Trailer(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
