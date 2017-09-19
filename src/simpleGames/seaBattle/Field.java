package simpleGames.seaBattle;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Field {

    public static final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    public void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    public void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }

    public void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Miss");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Hit");
                cells[shoot] = '-';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Already shot");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    public void show() {
        System.out.println(cells);
    }

    public boolean isNotGameOver() {
        return cells[ship.position] == 'X';
    }
}
