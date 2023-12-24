package td3.ex6;

public class Rectangle extends Figure
{
    private int lo,la;

    public Rectangle(int lo, int la)
    {
        this.lo=lo;
        this.la=la;
    }
    public Rectangle(int lo, int la,String nom)
    {    super(nom);
        this.lo=lo;
        this.la=la;
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    public int getLa() {
        return la;
    }

    public int getLo() {
        return lo;
    }

    public void setLa(int la) {
        this.la = la;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lo=" + lo +
                ", la=" + la +
                '}';
    }

    @Override
    public String getP() {
        return null;
    }

    @Override
    public int getA() {
        return 0;
    }
}
