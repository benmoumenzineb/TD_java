package TD2;

public class EX2 {
public static void main(String [] args){
    pointa p=new pointa();
    p.setAbs(5);
    p.setOrd(8);
    p.afficher();
    p.norme();
    System.out.println(p.toString());

}
}
class pointa{ private double abs;
    private double ord;
    pointa(){}
    pointa(double ord,double abs){
        this.abs=abs;
        this.ord=ord;
    }

    public double getAbs() {
        return abs;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }
    void afficher(){
        System.out.println("ordonnee est:"+ord+"abcisse est"+abs);
    }
    double C;
     double norme(){ return C = Math.sqrt(abs*abs + ord*ord);
     }

    @Override
    public String toString() {
        return "pointa{" +C
                 +
                '}';
    }
}
