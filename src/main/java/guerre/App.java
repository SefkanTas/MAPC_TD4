package guerre;

import guerre.attaque.Attaque;
import guerre.attaque.Missile;
import guerre.deplacement.Courir;
import guerre.deplacement.Deplacement;

public class App {
    public static void main(String[] args) {
        Deplacement courir = new Courir();
        Attaque missile = new Missile();
        Unite soldat = new Unite(courir, missile);
        soldat.attaquer();
        soldat.seDeplacer();
    }
}
