package repeat.classes_project.java_7;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Dog extends Pet{
    private String type;

    public Dog(String name, int age, String nick, String type) {
        super(name, age, nick);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void voice() {
        System.out.println("dog voice");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                '}';
    }
}
