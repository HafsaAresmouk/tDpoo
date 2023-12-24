package TD2;


 class Livre {
    String auteur;
    String titre;
    double prix;
    double annee;
    public Livre(){

    }
    public Livre(String titre){
        this.titre=titre;
    }
    public Livre(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
    }
    public Livre(String titre,String auteur,double prix){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    public Livre(String titre,String auteur,double prix,double annee){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        this.annee=annee;
    }
    public Livre(Livre autreLivre){
        this.annee=autreLivre.annee;
        this.prix=autreLivre.prix;
        this.auteur=autreLivre.auteur;
        this.titre=autreLivre.titre;
    }
    public double getPrix(){
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getAnnee() {
        return annee;
    }

    public void setAnnee(double annee) {
        this.annee = annee;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String toString(){
        return "Livre [Titre : " + titre + ", Auteur : " + auteur + ", Prix : " + prix + ", Année : " + annee + "]";
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Harry Potter");
        Livre livre3 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien");
        Livre livre4 = new Livre("Dune", "Frank Herbert", 19.99);
        Livre livre5 = new Livre("1984", "George Orwell", 12.99, 1949);

    }
}
