package repeat.classes_project.java_12_Softserve;

/**
 * Created by Mykhailo on 21/09/2017.
 */
public class Trainee {
    private String fullName;
    private int age;
    private boolean isEducation;

    public Trainee(String fullName, int age, boolean isEducation) {
        this.fullName = fullName;
        this.age = age;
        this.isEducation = isEducation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1) {
            this.age = age;
        } else {
            System.out.println("Error");
        }
    }

    public boolean isEducation() {
        return isEducation;
    }

    public void setEducation(boolean education) {
        isEducation = education;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", isEducation=" + isEducation +
                '}';
    }
}
