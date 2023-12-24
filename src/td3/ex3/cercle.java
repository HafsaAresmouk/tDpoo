package td3.ex3;

public class cercle extends Centre
{
   private double r;
    public cercle(int x, int y, String nom,double r)
    {
        super(x, y, nom);
        this.r=r;
    }
    public void affr()
    {
        System.out.println("le rayon de cercle est"+r);

    }
    public void affrCente()
    {
        affr();
        affNomCord();
    }

    public static void main(String[] args)
    {
        cercle a=new cercle(3,4,"a",19);
        a.affr();
        a.affrCente();
    }
}
