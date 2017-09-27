package repeat.simple_project;

import java.util.Scanner;

/**
 * Created by Mykhailo on 27/09/2017.
 */
public class Java_7_MinimumCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int coins[] = {1, 2, 5, 10, 25, 50};
        int coinsUsed[] = new int[coins.length];
        for (int i = 0; i < coinsUsed.length; i++) {
            coinsUsed[i] = 0;
        }
        System.out.print("Enter Number: ");

        int number = scanner.nextInt();
        while (number > 0) {
            for (int i = coins.length - 1; i >= 0; i--) {
                if (number >= coins[i]) {
                    number -= coins[i];
                    count++;
                    coinsUsed[i]++;
                    break;
                }
            }
        }
        System.out.println("Minimum you need " + count + " coins");
        for (int i = coinsUsed.length - 1; i >= 0; i--) {
            if (coinsUsed[i] != 0) {
                System.out.println(coinsUsed[i] + " x " + coins[i]);
            }
        }
        scanner.close();
    }
}
