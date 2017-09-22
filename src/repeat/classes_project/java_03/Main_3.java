package repeat.classes_project.java_03;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Main_3 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAge(10);
        animal.setName("Coco");

        System.out.println(animal.getName() + " " + animal.getAge());
        System.out.println();


        Animal animal1 = new Animal();

        animal1.setName("con");
        animal1.setAge(50);


    }

}
