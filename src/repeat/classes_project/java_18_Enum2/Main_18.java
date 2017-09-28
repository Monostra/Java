package repeat.classes_project.java_18_Enum2;

import java.util.Scanner;

/**
 * Created by Mykhailo on 28/09/2017.
 */
public class Main_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = scanner.nextLine();

        Month [] months = Month.values();
        boolean b = false;
        for (int i = 0; i < months.length; i++) {
            if (months[i].name().equalsIgnoreCase(month)) {
                System.out.println("Such month is");
                b = true;
            }
        }
        if (!b) {
            System.out.println("no");
        }


    }
}
