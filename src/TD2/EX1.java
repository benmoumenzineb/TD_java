package TD2;

public class EX1 {
    public static void main(String [] args){
        char nom ;
        double abs;
        double dx;
        point p = new point('A', 3);
        p.afficher();
        p.translate(dx=2);
        System.out.println(p.toString());

    }
}
class point{char nom;
    double abs;
    //constructeur parametree
    point(char nom,double abs){
        this.nom=nom;
        this.abs=abs;
    }
    void afficher(){
        System.out.println("nom est:"+nom+"abcisse est"+abs);
    }
    void translate(double dx){
        abs=abs+dx;
    }

    @Override
    public String toString() {
        return "point{" +
                "nom=" + nom +
                ", abs=" + abs +
                '}';
    }
}

