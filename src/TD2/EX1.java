package TD2;


 class Points{
      char nom;
     double abscisse;


     public Points(char nom,double abscisse){
        this.nom=nom;
        this.abscisse=abscisse;
    }
    public void affichage(){
        System.out.println("Point"+nom+"abscisse"+abscisse);
    }
    public void translate(double translation){
    abscisse +=translation;
    }

    public static void main(String[] args) {
        Points point = new Points('A', 3);
        System.out.println("le point avant translation");
        point.affichage();
        point.translate(1.5);
        System.out.println("le point apres translation");
        point.affichage();

    }
}
