package td3.ex4;

public class Maison extends Batiment
{
   private int nbChambres;
    public Maison() {
        super();
        this.nbChambres = 0;
    }
   public Maison(String adresse,int nbChambres)
   {
       super(adresse);
       this.nbChambres=nbChambres;
   }

    @Override
    public String getAdresse() {
        return super.getAdresse();
    }

    @Override
    public void setAdresse(String adresse) {
        super.setAdresse(adresse);
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + nbChambres +
                '}';
    }
}
