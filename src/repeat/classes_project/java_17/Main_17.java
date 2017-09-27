package repeat.classes_project.java_17;

/**
 * Created by Mykhailo on 26/09/2017.
 */
public class Main_17 {
    public static void main(String[] args) {
        Transport transport = Transport.CAR;

        System.out.println(transport.name());
        System.out.println(transport.ordinal());
        System.out.println(transport.compareTo(transport.TRAIN));

        Transport[] transports = transport.values();
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i].name());
        }

        System.out.println();

        int max = 0;
        for (int i = 0; i < transport.values().length; i++) {
            if (transport.values()[i].name().length() > max) {
                max = transport.values()[i].name().length();
            }
        }
        for (int i = 0; i < transport.values().length; i++) {
            if (transport.values()[i].name().length() == max) {
                System.out.println(transport.values()[i]);
            }
        }

        System.out.println(max);
        System.out.println();
        Transport tr = Transport.CAR;

        switch (tr) {
            case BIKE:
                break;
            case BUS:
                break;
            case CAR:
                break;
            case PLANE:
                break;
            case HORSE:
                break;
            default:
                break;
        }

        Person person = new Person();
        person.toGo(Transport.CAR);

        System.out.println();
        int maxx = 0;
        String nameMax = "";
        for (int i = 0; i < transport.values().length; i++) {
            if (transport.values()[i].getMaxSpeed() > maxx) {
                maxx = transport.values()[i].getMaxSpeed();
                nameMax = transport.values()[i].name();
            }
        }
        System.out.println(nameMax + " " + maxx);
    }
}
