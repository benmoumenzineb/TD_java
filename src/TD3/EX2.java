package TD3;

public class EX2 {
    public void Main(String [] args){

    }
}
class Point1 {
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;
}
class PointNom extends Point1{
    private int x,y;
    private char nom;
    public void setPointNom(){
        System.out.println("les coordonnées sont:"+x+"  "+y+"le nom est:"+nom);
    }
    public void setNom(){
System.out.println("le nom est:"+nom);
    }
    public void affCoordNom(){
        System.out.println("les coordonnées sont:"+x+"  "+y+"le nom est:"+nom);
    }
}

