package simpleGames.seaBattle;

import java.util.Scanner;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Player {
    public int getShoot() {
        System.out.println("Where is shoot");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print("You Enter: " + s + "\n");
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
