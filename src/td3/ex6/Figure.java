package td3.ex6;

public abstract class  Figure
{
    private String nom;
    private int p,a;
    public Figure(){}
    public Figure(String nom)
    {
        this.nom=nom;
    }

    public abstract String getP();

    public abstract int getA();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setP(int p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                ", p=" + p +
                ", a=" + a +
                '}';
    }
}
