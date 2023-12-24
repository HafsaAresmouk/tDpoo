package TD2;


class Rectangle {
    double longeure;
    double largeure;
    public Rectangle(){
        longeure=0;
        largeure=0;
    }
    public Rectangle(double largeure){
        this. longeure=largeure;
        this.largeure=largeure;
    }
    public Rectangle(double longeure,double largeure){
        this.longeure=longeure;
        this.largeure=largeure;
    }

    public double getLargeure() {
        return largeure;
    }

    public void setLargeure(double largeure) {
        if (largeure <=0) {
            System.out.println("entrez un nombre positive");
        }
        else this.largeure = largeure;
    }

    public double getLongeure() {
        return longeure;
    }

    public void setLongeure(double longeure) {
        if (longeure <=0) {
            System.out.println("entrez un nombre positive");
        }
        else this.longeure = longeure;
    }

}
