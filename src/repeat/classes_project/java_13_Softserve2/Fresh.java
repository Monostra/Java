package repeat.classes_project.java_13_Softserve2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mykhailo on 21/09/2017.
 */
public class Fresh {
    List<Fruit> fruits = new ArrayList<>();

    public void addToJuices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter trainee:");
        String name = scanner.nextLine();
        Fruit fruit = new Fruit(name);
        fruits.add(fruit);
    }

    public void addToSlicer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter trainee:");
        String name = scanner.nextLine();
        Fruit fruit = new Fruit(name);
        fruits.add(fruit);
    }

    @Override
    public String toString() {
        return "Fresh{" +
                "fruits=" + fruits +
                '}';
    }
}
