package guerre.attaque;

import guerre.Unite;

public class Canon implements Attaque{
    int degats;

    public Canon() {
        degats = 20;
    }

    @Override
    public void attaquer(Unite other) {
        System.out.println("Attaque avec un canon");
        other.attacked(degats);
    }
}
