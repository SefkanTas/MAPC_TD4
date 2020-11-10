package guerre;

import guerre.attaque.Attaque;
import guerre.deplacement.Deplacement;

public class Unite {

    private Deplacement deplacement;
    private Attaque attaque;
    private String name;

    private int pv;

    public Unite(String name, Deplacement deplacement, Attaque attaque) {
        this.name = name;
        this.deplacement = deplacement;
        this.attaque = attaque;
        this.pv = 100;
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }

    public void attaquer(Unite other){
        attaque.attaquer(other);
    }

    public void attacked(int degats){
        this.pv -= degats;
        StringBuilder sb = new StringBuilder("PV ")
                .append(name)
                .append(" : ")
                .append(pv);
        System.out.println(sb.toString());
    }

}
