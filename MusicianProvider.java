package edu.nyu.cs9053.homework5;

/**
 * User: blangel
 * Date: 2/20/17
 * Time: 4:05 PM
 */
public class MusicianProvider {

    public static Musician createLargoMusician() {
        return new LargoMusician();
    }

    public static Musician createModeratoMusician() {
        return new ModeratoMusician();
    }

    public static Musician createPrestissimoMusician() {
        return new PrestissimoMusician();
    }

    public static MusicalInstrument randomlyChoose() {

        return new RandomInstrument().selectInstrument();
    }

}
