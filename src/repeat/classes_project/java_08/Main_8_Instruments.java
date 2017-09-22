package repeat.classes_project.java_08;

/**
 * Created by Mykhailo on 20/09/2017.
 */
public class Main_8_Instruments {
    public static void main(String[] args) {
        Drums drums = new Drums(100);
        Gitar gitar = new Gitar(200);
        Piano piano = new Piano(300);

        Instrument instrument = new Drums(400);
        instrument.play();

        gitar.play();
        drums.play();
        piano.play();

        System.out.println();
        Instrumentalist instrumentalist = new Instrumentalist();
        instrumentalist.performance(drums);

        System.out.println();

        Instrument[] instruments = {drums, piano, gitar};
        instrumentalist.performanceAllInstrument(instruments);
    }
}
