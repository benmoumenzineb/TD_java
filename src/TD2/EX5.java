package TD2;

public class EX5 {
    public static void main(String [] args){
        int longueur;
        int largeur;
        Rectangle rectangle = new Rectangle(longueur =2, largeur =4);
        System.out.println(rectangle);
    }
}
class Rectangle{
    private double longueur,largeur;
    public Rectangle(){}
    public Rectangle(double longueur, double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }
    public Rectangle(Rectangle rectangle){
        this.longueur=rectangle.getlongueur();
        this.largeur=rectangle.getlargeur();
    }

    private double getlargeur() {
        return 0;
    }

    private double getlongueur() {
        return 0;
    }


    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLongueur(double longueur) {
        if(longueur >=0){
            this.longueur = longueur;
        }}

    public void setLargeur(double largeur) {
        if(longueur >=0)
            this.largeur=largeur;
        else this.largeur = 0;}
    public double perimetre(){
        return 2*(longueur + largeur);
    }
    public double aire(){
        return longueur*largeur;
    }
    public boolean isCarre(){
        return largeur==longueur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", aire=" +aire() +
                ", isCaree=" + (isCaree()? "oui" : "non")+
                '}';
    }

    private boolean isCaree() { return true;
    }


}

