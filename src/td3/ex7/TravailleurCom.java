package td3.ex7;

public class TravailleurCom extends Employe
{
    private float salaire;
    private float com;
    private int q;
    public TravailleurCom(){}
    public TravailleurCom(String nom,String prenom,float salaire,float com)
    {
        super(nom,prenom);
        this.com=com;
        this.salaire=salaire;
    }

    @Override
    public String toString() {
        return super.toString()+"salaire: "+gains();
    }

    @Override
    public float gains() {
        salaire+=com/100;
        return salaire;
    }
}
