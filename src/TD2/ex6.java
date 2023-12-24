package TD2;


class banque
{
    private int Ncompte;
    private float solde;
    private String cin;
    public banque(int Ncompte,float solde,String cin)
    {
        this.cin=cin;
        this.Ncompte=Ncompte;
        this.solde=solde;
    }
    public void deposer(float somme)
    {
        solde=somme+solde;
        System.out.println("votre solde apres la disposition est"+solde);
    }
    public void retirer(float somme)
    {
        solde-=somme;
        System.out.println("votre solde apres la retiration est"+solde);
    }
    public float avoirSold()
    {
        return this.solde;
    }


    public String avoirInf() {
        return "banque{" +
                "Ncompte=" + Ncompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        banque banque1 = new banque(1,5000,"AB 1200");

        System.out.println(banque1.avoirInf());
        System.out.println(banque1.avoirSold());
        banque1.deposer(500);
        System.out.println(banque1.avoirInf());
        System.out.println(banque1.avoirSold());
        banque1.retirer(200);
        System.out.println(banque1.avoirInf());
        System.out.println(banque1.avoirSold());

    }
}