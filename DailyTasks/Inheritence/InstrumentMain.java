
//Create a class Instrument with a name and a method play(). Make Guitar and Piano subclasses that show their name and play sound.

package Inheritence;

class Instrument {
    String name;
    void play() {
        System.out.println("Playing " + name);
    }
}

class Guitar extends Instrument {
    Guitar() { name = "Guitar"; }
}

class Piano extends Instrument {
    Piano() { name = "Piano"; }
}

public class InstrumentMain {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play(); 
        p.play(); 
    }
}
