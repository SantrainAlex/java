package org.example.exo6;

public class Simple extends Compte{
    private int decouvert;

    public Simple(int solde) {
        super(solde);
    }


    public void debit(int nbrRetrait) {
        if(decouvert <= super.getSolde(nbrRetrait)){
            int calcul = nbrRetrait - super.getSolde(nbrRetrait);
            super.setSolde(calcul);
            System.out.println("Vous avez retirer "+ nbrRetrait);
        }
    }
}
