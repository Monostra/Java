package repeat.classes_project.java_11;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public abstract class Sedan extends Car {
    private Trailer trailer;

    public abstract void getTrailer(Trailer trailer);

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "trailer=" + trailer +
                '}';
    }
}
