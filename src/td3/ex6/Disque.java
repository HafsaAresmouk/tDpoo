package td3.ex6;

public class Disque extends Figure
{
    private String centre;
    private int r;
    public Disque(){}
    public Disque(int r, String centre)
    {
        this.centre=centre;
        this.r=r;
    }
    public Disque(String nom,int r, String centre){
        super(nom);
        this.centre=centre;
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getCentre() {
        return centre;
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public String toString() {
        return "Disque{" +
                "centre='" + centre + '\'' +
                ", r=" + r +
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
