package repeat.simple_project;

import java.util.Scanner;

/**
 * Created by Mykhailo on 14/09/2017.
 */
public class Java_1 {
    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = "World!";

        boolean b1 = s1.equalsIgnoreCase(s2);
        System.out.println(b1);

        if (s1.equals("Hello!!!")) {
            System.out.println("yes if");
        } else if (s1.equals("Hello!")) {
            System.out.println("else if");
        } else {
            System.out.println("esle");
        }
        System.out.println("");

        int x = 343;
        if (x % 2 == 0) {
            System.out.println("parne");
        } else {
            System.out.println("ne parne");
        }
        System.out.println("");

        switch ("3") {
            case "1":
                System.out.println("case 1");
                break;
            case "2":
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
                break;
        }
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of your month birthday: ");
        int month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
