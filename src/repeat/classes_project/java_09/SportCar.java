package repeat.classes_project.java_09;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class SportCar extends Car {
    private boolean nitro;

    @Override
    public void drive() {
        System.out.println("sport car drive");
    }

    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }

}
