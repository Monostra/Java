package repeat.classes_project.java_10;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Person {

    static {
        System.out.println("person statick block");
    }

    {
        System.out.println("person simple block");
    }

    private String name;
    private String nic;
    private int age;

    public Person(String name, String nic, int age) {
        this.name = name;
        this.nic = nic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", age=" + age +
                '}';
    }
}
