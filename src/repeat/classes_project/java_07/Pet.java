package repeat.classes_project.java_07;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Pet extends Animal{
    private String nick;

    public Pet(String name, int age, String nick) {
        super(name, age);
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void voice() {
        System.out.println("pet voice");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
