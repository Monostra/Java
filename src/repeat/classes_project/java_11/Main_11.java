package repeat.classes_project.java_11;

/**
 * Created by Mykhailo on 21/09/2017.
 */
public class Main_11 {
    public static void main(String[] args) {
        Trailer trailer = new Trailer("square", 2000);
        Renault renault = new Renault();
        renault.setWeight(1300);
        System.out.println(renault.getWeight());
        renault.getTrailer(trailer);
        System.out.println(renault.getWeight());
    }
}
