package repeat.classes_project.java_14_Monsters;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public class Dracula implements Monster, Vampire{
    @Override
    public void smash() {
        System.out.println("dracula smash");
    }

    @Override
    public void scarepeople() {
        System.out.println("dracula scare people");
    }

    @Override
    public void suckBlood() {
        System.out.println("dracula suck blood");
    }
}
