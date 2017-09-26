package repeat.classes_project.java_16_Salary;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public class EmploeeHour implements Salary {

    @Override
    public void salary(int time, int sum) {
        System.out.println("Emploee hour salary = " + time * sum);
    }
}
