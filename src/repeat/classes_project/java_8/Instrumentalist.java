package repeat.classes_project.java_8;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Instrumentalist {
    public void performance(Instrument instrument) {
        instrument.play();
    }

    public void performanceAllInstrument(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
