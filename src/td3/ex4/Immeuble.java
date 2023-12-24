package td3.ex4;

public class Immeuble extends Batiment

{
    private int nbAppart ;
    public Immeuble(String adresse,int nbAppart)
    {
        super(adresse);
        this.nbAppart=nbAppart;
    }

    @Override
    public String getAdresse() {
        return super.getAdresse();
    }

    public int getNbAppart() {
        return nbAppart;
    }

    @Override
    public void setAdresse(String adresse) {
        super.setAdresse(adresse);
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + nbAppart +
                '}';
    }

}
