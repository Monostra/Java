package repeat.simple_project;

import java.util.Scanner;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public class Java_8_ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String number = scanner.next();
        String reverse = "";
        char[] str = new char[number.length()];
        for (int i = str.length - 1; i >= 0; i--) {
            reverse += number.charAt(i);
        }
        System.out.println(reverse);
        scanner.close();
    }
}
