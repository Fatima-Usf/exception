/**
 * Created by fatima on 04/12/16.
 */
public class Compte {

    private int numCompte;
    private double solde, debitMax, decouvertMax;
    public Compte(int numCompte, double solde, double debitMax,double decouvertMax){
        this.numCompte=numCompte;
        this.solde=solde;
        this.debitMax=debitMax;//le max qu'il peut retourner
        this.decouvertMax=decouvertMax;//crédit
    }


    public Compte(int numCompte) {
        this.numCompte = numCompte;
        this.solde=100000;
        this.debitMax=80000;
        this.decouvertMax=20000;

    }



    public int getNumCompte() {
        return numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public double getDebitMax() {
        return debitMax;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDebitMax(double debitMax) {
        this.debitMax = debitMax;
    }

    public void setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    double retrait (double montant)throws DebitMaxException, DecouvertMaxException{//ça va signaler que cette methode la va signaler des ecpetion
        if((solde-montant)<decouvertMax)
            throw new DecouvertMaxException();
        else
            solde = solde - montant;
        if (montant>debitMax)
            throw new DebitMaxException();
        else
            solde = solde - montant;
        return solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                ", debitMax=" + debitMax +
                ", decouvertMax=" + decouvertMax +
                '}';
    }
}

