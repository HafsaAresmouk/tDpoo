package td3.ex1;

public class PointA extends Point
{
 public PointA(int x,int y)
 {
     super(x ,y);
 }
 public void afficher()
 {
     System.out.println("l abscisse x" + getX()+"l abscisse x" + getY());
 }
    public class Main {
        public static void main(String[] args) {
            Point point = new Point(3, 4);
            point.deplace(2, 3);
            System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");

            PointA pointA = new PointA(1, 1);
            pointA.deplace(5, 5);
            pointA.afficher();
        }
}}
