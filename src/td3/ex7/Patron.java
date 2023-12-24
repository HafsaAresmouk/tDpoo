package td3.ex7;

public class Patron extends Employe{
    private float salaire;
    public Patron(){}
    public Patron(String nom,String prenom,float salaire)
    {
        super(nom,prenom);
        this.salaire=salaire;
    }

    @Override
    public String toString()
    {

        return super.toString()+"salaire:"+gains();
    }

    @Override
    public float gains() {
        return salaire;
    }

}
