package org.example.exo6;

public class Payant extends Compte {

    public Payant(int solde) {
        super(solde);
    }

    @Override
    public int getSolde(int nbr) {
        int calcul = (nbr * 5)/100;
        return (super.getSolde(nbr - calcul ));

    }

    @Override
    public void setSolde(int solde) {
        int calcul = (solde * 5)/100;
        super.setSolde(solde - calcul);
    }
}
