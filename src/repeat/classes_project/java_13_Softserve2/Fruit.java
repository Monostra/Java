package repeat.classes_project.java_13_Softserve2;

/**
 * Created by Mykhailo on 21/09/2017.
 */
public class Fruit implements IJuiceable, ISliceable{
    private String nameFruit;

    public Fruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    @Override
    public String makeJuice(String name) {
        String s = "Juice from "+ name;
        return s;
    }

    @Override
    public String makeSlice(String name) {
        String s = "Slice from "+name;
        return s;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                '}';
    }
}


