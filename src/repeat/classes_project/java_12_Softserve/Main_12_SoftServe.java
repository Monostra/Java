package repeat.classes_project.java_12_Softserve;

/**
 * Created by Mykhailo on 21/09/2017.
 */
public class Main_12_SoftServe {
    public static void main(String[] args) {
        Group group = new Group();
        group.setName("First group");
        System.out.println(group.toString());
        group.addTrainee();
        System.out.println(group.toString());

    }
}
