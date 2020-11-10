package guerre.attaque;

import guerre.Unite;

public class Mitraillette implements Attaque {

    int degats;

    public Mitraillette() {
        degats = 10;
    }

    @Override
    public void attaquer(Unite other) {
        System.out.println("Attaque avec une mitraillette");
        other.attacked(degats);
    }
}
