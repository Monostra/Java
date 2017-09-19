package repeat.classes_project.java_2;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Rectangle {
    int length;
    int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void perimeter() {
        int per = 2 * (length + width);
        System.out.println("Perimeter of rectangle = " + per);
    }

    public void area() {
        int area = length * width;
        System.out.println("Area of rectangle = " + area);
    }
}
