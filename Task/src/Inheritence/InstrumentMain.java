package Inheritence;

class Instrument {
    String name;

    Instrument(String name) {
        this.name = name;
    }

    void play() {
        System.out.println("Playing the instrument: " + name);
    }
}

class Guitar extends Instrument {
    Guitar(String name) {
        super(name);
    }

    void play() {
        System.out.println("Strumming the guitar: " + name);
    }
}

class Piano extends Instrument {
    Piano(String name) {
        super(name);
    }

    void play() {
        System.out.println("Playing the piano: " + name);
    }
}

public class InstrumentMain {
    public static void main(String[] args) {
        Guitar g = new Guitar("Acoustic Guitar");
        Piano p = new Piano("Yamaha Piano");

        g.play();
        p.play();
    }
}
