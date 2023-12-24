package TD2;




 class Point{
    double abscisse;
    double ordonne;
    public Point(){
        abscisse=0.0;
        ordonne=0.0;
    }
    public Point(double abscisse,double ordonne){
        this.abscisse=abscisse;
        this.ordonne=ordonne;
    }
    public double getAbscisse(){
        return abscisse;
    }

    public void setAbscisse(double abscisse){
        this.abscisse=abscisse;
    }
    public double getOrdonne(){
        return ordonne;
    }
    public void setOrdonne(double ordonne){
        this.ordonne=ordonne;
    }
    public double Norm(){
        return Math.sqrt(abscisse*abscisse+ordonne*ordonne);
    }

    public static void main(String[] args) {
        Point pointA = new Point();
        System.out.println("l abscicesse de point par default" +pointA.getAbscisse()+"l ordonnee de point par default"+pointA.getOrdonne());
        System.out.println(" la distance entre l’origine du repère et le point"+pointA.Norm());
        Point pointB=new Point(1,2);
        System.out.println("l abscicesse de point par intialization" +pointB.getAbscisse()+"l ordonnee de point par intialization"+pointB.getOrdonne());
        System.out.println(" la distance entre l’origine du repère et le point"+pointB.Norm());
        pointB.setAbscisse(4);
        pointB.setOrdonne(1);
        System.out.println("le nouveau  abscicesse de point par le setter" +pointB.getAbscisse()+"le nouveau ordonnee  de point par le setter"+pointB.getOrdonne());
        System.out.println(" la distance entre l’origine du repère et le point"+pointB.Norm());

    }


}
