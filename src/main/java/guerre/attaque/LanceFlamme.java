package guerre.attaque;

import guerre.Unite;

public class LanceFlamme implements Attaque{

    int degats;

    public LanceFlamme() {
        degats = 30;
    }

    @Override
    public void attaquer(Unite other) {
        System.out.println("Attaque avec un lance flamme");
        other.attacked(degats);
    }
}
