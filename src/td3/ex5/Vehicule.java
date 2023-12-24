package td3.ex5;

public class Vehicule
{
    private int nbPassager;
    public Vehicule(int nbPassager)
    {
        this.nbPassager=0;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }
}
