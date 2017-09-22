package repeat.classes_project.java_04;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Human {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private String name;
    private boolean isHunter;
    private int age;

    public Human() {
    }

    public Human(String name, boolean isHunter, int age) {
        this.name = name;
        this.isHunter = isHunter;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHunter() {
        return isHunter;
    }

    public void setHunter(boolean hunter) {
        isHunter = hunter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", isHunter=" + isHunter +
                ", age=" + age +
                '}';
    }

    public void typeOfHuman() {
        String type;
        if (isHunter) {
            type = "Hunter";
        } else {
            type = "Picker";
        }
        System.out.println(type);
    }

    public void typeOfEat() {
        String[] meatEat = {"pork", "cow", "deer"};
        String[] pinchEat = {"carrots", "potatoes", "garlic"};

        System.out.println("You can eat: ");
        int meal;
        if (isHunter) {
            for (int i = 0; i < meatEat.length; i++) {
                System.out.println(i + 1 + ") " + meatEat[i]);
            }
            System.out.print("Chose the meal: ");
            meal = scanner.nextInt();
            for (int i = 0; i < meatEat.length; i++) {
                if (meal - 1 == i) {
                    System.out.println(name + " eat " + random.nextInt(10) + "kg. of " + meatEat[i]);
                }
            }
        } else {
            for (int i = 0; i < pinchEat.length; i++) {
                System.out.println(i + 1 + ") " + pinchEat[i]);
            }
            System.out.print("Chose the meal: ");
            meal = scanner.nextInt();
            for (int i = 0; i < pinchEat.length; i++) {
                if (meal - 1 == i) {
                    System.out.println(name+" eat "+ random.nextInt(5)+"kg. of " + pinchEat[i]);
                }
            }
        }
    }
}
