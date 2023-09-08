package org.example.exo6;

public class Epargne extends Simple{
    int tauxInteret;

    public Epargne(int solde) {
        super(solde);
    }

    public void calculInterer(int nbrRetrait) {
        setSolde(tauxInteret);
    }


}
