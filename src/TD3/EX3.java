package TD3;

public class EX3 {
    public void Main(String [] args){

    }
}
class Point2 {
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;
}
class Centre extends Point2{
    //ici on doit faire l'appel du constructeur point2 de la classe mère avec le mot clé super sinon il sera une faute
    public Centre(int x, int y) {
        super(x, y);
    }
    public Centre(int x,int y,char nom){
        super(x,y);
    }
    public void affNom(){
        char nom =0;
        System.out.println("le nom est:"+nom);
    }

    @Override
    public void affiche() {
      //  super.affiche();
        int x=0,y=0;
        char nom=0;
        System.out.println("les coordonnées sont:"+x+"  "+y+"le nom est:"+nom);
    }
}