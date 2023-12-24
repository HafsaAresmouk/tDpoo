package td3.ex2;

public class PointName extends Point
{
  private int  x,y;
  private String nom;
  public PointName(int x , int y , String nom)
  {
      this.nom=nom;
      this.y=y;
      this.x=x;

  }

    public void setNom(String nom)
    {
        this.nom = nom;
    }
    public void affCoordNom()
    {
        System.out.println("le nom de point est :"+nom+"leor cordonnes :"+x+","+y);
    }
}
