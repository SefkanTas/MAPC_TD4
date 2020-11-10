package guerre;

import guerre.attaque.Attaque;
import guerre.deplacement.Deplacement;

public class Unite {

    private Deplacement deplacement;
    private Attaque attaque;

    public Unite(Deplacement deplacement, Attaque attaque) {
        this.deplacement = deplacement;
        this.attaque = attaque;
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }

    public void attaquer(){
        attaque.attaquer();
    }
}
