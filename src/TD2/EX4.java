package TD2;

public class EX4 {
    public static void main(String [] args){
        int m,h,s;
        Temps t = new Temps(s= 20,m= 23,h= 1);
        System.out.println(t.toString());
        t.ajouterM(m= 300);
        System.out.println(t.toString());
        t.ajouterS(s= 3600);
        System.out.println(t.toString());
    }
}
class Temps {
    private static int s;
    private static int m;
    private static int h;

    public Temps() {
    }

    public Temps(int h) {
        this();
        this.h = h;
    }

    public Temps(int m, int h) {
        this(h);
        this.m = m;
    }

    public Temps(int s, int h, int m) {
        this(m, h);
        this.s = s;
    }

    public Temps(Temps temps) {
        this(Temps.getS(), Temps.getM(), Temps.getH());
    }

    public void ajouterH(int h) {
        this.setH(this.getH() + h);
    }

    public void ajouterM(int m) {
        m += this.getM();
        ajouterH(h = m / 60);
        this.setM(m % 60);
    }

    public void ajouterS(int s) {
        s += this.getS();
        ajouterM(m = s / 60);
        this.setS(s % 60);
    }

    public static int getS() {
        return s;
    }

    public static int getM() {
        return m;
    }

    public static int getH() {
        return h;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Temps{" +
                "s=" + s +
                ", m=" + m +
                ", h=" + h +
                '}';
    }
}

