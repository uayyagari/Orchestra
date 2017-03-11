package edu.nyu.cs9053.homework5;

import java.util.Random;

public class RandomInstrument {

    public MusicalInstrument selectInstrument(){
        Random rand = new Random();
        int randVal = rand.nextInt(14);

        switch(randVal){
            case 0:
                return new Tenoroon("sample",5);
            case 1:
                return new Clarinet("sample",5);
            case 2:
                return new Piccolo("sample",5);
            case 3:
                return new Cello("sample",5);
            case 4:
                return new Sanxian("sample",5);
            case 5:
                return new Sitar("sample",5);
            case 6:
                return new DrumMachine("sample",5);
            case 7:
                return new KeyBoard("sample",5);
            case 8:
                return new Triangle("sample",5);
            case 9:
                return new Xylophone("sample",5);
            case 10:
                return new Chenda("sample",5);
            case 11:
                return new Tsuzumi("sample",5);
            case 12:
                return new BassGuitar("sample",5);
            case 13:
                return new ElectricGuitar("sample",5);
        }

        return null;
    }

}
