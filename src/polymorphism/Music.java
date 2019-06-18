package polymorphism;

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play" + n);
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play" + n);
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}