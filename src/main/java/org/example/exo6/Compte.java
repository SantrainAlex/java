package org.example.exo6;

public class Compte {
    private int id;
    private int solde;
    private static int count;

    {
        count ++;
    }

    public Compte(int solde) {
        this.id = count;
        this.solde = solde;
        System.out.println("création du coumpte n° "+id+"avec un solde de "+solde);
    }

    public int getSolde(int nbr) {
        setSolde(solde- nbr);
        System.out.println("le solde et de "+(solde-nbr));
        return nbr;
    }

    public void setSolde(int solde) {
        this.solde = solde;
        System.out.println(solde);
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                '}';
    }
}
