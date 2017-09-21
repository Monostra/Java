package repeat.classes_project.java_11;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Renault extends Sedan{
    public final int maxPlace = 7;


    @Override
    public void getTrailer(Trailer trailer) {
        int weight = (int) (super.getWeight() + trailer.getWeight());
        super.setWeight(weight);
    }

    @Override
    public void drive() {
        System.out.println("renault drive");
    }
}
