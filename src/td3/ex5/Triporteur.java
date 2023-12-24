package td3.ex5;

public class Triporteur extends Moto{
    private int nbMoteur;

    public Triporteur(int nbPassager, int nbRoues,int nbMoteur) {
        super(nbPassager, nbRoues);
        this.nbMoteur=nbMoteur;
    }
}
