package repeat.classes_project.java_10;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Main_10 {
    static {
        System.out.println("main static block");
    }

    static {
        System.out.println("main simble block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Main_10 main10 = new Main_10();
        Person person = new Person("vova","vov", 23);
    }

    static {
        System.out.println("main statick block 2");
    }
}
