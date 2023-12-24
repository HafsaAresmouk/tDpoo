package td3.ex7;

public abstract class Employe
{
    private String nom,prenom;
    public Employe(){}
    public Employe(String nom,String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    public abstract float gains();
}
