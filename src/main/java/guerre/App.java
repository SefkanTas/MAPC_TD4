package guerre;

import guerre.attaque.Attaque;
import guerre.attaque.Missile;
import guerre.attaque.Mitraillette;
import guerre.deplacement.Courir;
import guerre.deplacement.Deplacement;
import guerre.deplacement.Voler;

public class App {
    public static void main(String[] args) {
        Deplacement courir = new Courir();
        Deplacement voler = new Voler();
        Attaque missile = new Missile();
        Attaque mitraillette = new Mitraillette();

        Unite soldat = new Unite("soldat", courir, mitraillette);
        Unite helicoptere = new Unite("helicoptere", voler, missile);

        soldat.seDeplacer();
        helicoptere.attaquer(soldat);
        helicoptere.seDeplacer();

    }
}
