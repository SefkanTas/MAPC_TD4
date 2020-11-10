package guerre.attaque;

import guerre.Unite;

public class Missile implements Attaque{

    int degats;

    public Missile() {
        degats = 100;
    }

    @Override
    public void attaquer(Unite other) {
        System.out.println("Attaque avec un missile");
        other.attacked(degats);

    }
}
