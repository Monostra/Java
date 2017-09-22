package repeat.classes_project.java_12_Softserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mykhailo on 21/09/2017.
 */
public class Group {

    private String name;
    List<Trainee> trainees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTrainee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter trainee:");
        String traineeName = scanner.nextLine();
        int traineeAge = scanner.nextInt();
        boolean traineeIsEduc = scanner.nextBoolean();
        Trainee trainee = new Trainee(traineeName, traineeAge, traineeIsEduc);
        trainees.add(trainee);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainees=" + trainees +
                '}';
    }
}
