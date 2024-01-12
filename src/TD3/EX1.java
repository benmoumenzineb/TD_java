package TD3;

public class EX1 {
    public static void main(String [] args){

    }
}
class Point {
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
class PointA extends Point {

    public void afiiche(double abs,double ord){
        System.out.println("abcisse pointA est:"+abs+"ordonnee pointA est:"+ord);
    }
}