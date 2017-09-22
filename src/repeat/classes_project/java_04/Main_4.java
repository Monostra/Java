package repeat.classes_project.java_04;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Main_4 {
    public static void main(String[] args) {
        Human hunter = new Human("Ivan", true, 30);
        hunter.typeOfHuman();
        hunter.typeOfEat();

        System.out.println();

        Human picker = new Human("Mykola", false, 38);
        picker.typeOfHuman();
        picker.typeOfEat();
    }
}
