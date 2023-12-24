package td3.ex5;

public class Avion extends Vehicule
{
    private int nbMoteur;

    public Avion(int nbPassager,int nbMoteur)
    {
        super(nbPassager);
        this.nbMoteur=nbMoteur;
    }
}
