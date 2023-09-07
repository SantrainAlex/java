package org.example.exo5;

public class Chaise {
    protected int nbrPieds;
    protected String couleur;
    protected String materiaux;

    public Chaise(int nbrPieds, String couleur, String materiaux) {
        this.nbrPieds = nbrPieds;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public Chaise(){

    }

    @Override
    public String toString() {
        return "Je suis une Chaise, avec "+ nbrPieds +
                " pieds, en  " + materiaux +
                " et de couleur "+couleur;
    }
}
