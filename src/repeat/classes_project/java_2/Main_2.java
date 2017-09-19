package repeat.classes_project.java_2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Main_2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 10;
        rectangle.length = 20;

        rectangle.perimeter();
        rectangle.area();
        System.out.println();

        Rectangle square = new Rectangle(10, 10);

        square.perimeter();
        square.area();

    }
}
