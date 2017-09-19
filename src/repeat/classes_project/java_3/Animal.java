package repeat.classes_project.java_3;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        this.name = name;
        if (name.equalsIgnoreCase("con")) {
            System.out.println("error name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        this.age = age;
        if (age > 0 && age < 20) {
            this.age = age;
        } else {
            System.out.println("error age");
        }
    }
}
