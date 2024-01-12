package TD2;

public class EX6 {
    public static void main(String [] args){
banque b =new banque(1, 5000.75F,"AB 1200");
System.out.println(b.toString());
b.afficher();
b.deposer(500);
System.out.println(b.toString());
b.afficher();
b.retirer(200);
System.out.println(b.toString());
b.afficher();
    }
}
class banque{
    private int NCompt;
    private float Solde;
    private String CIN;
    public banque(int NCompt,float Solde,String CIN){
        this.NCompt=NCompt;
        this.Solde=Solde;
        this.CIN=CIN;
    }
    public float deposer(float somme){
        return Solde=Solde+somme;
    }
    public float retirer(float somme){
        return Solde=Solde-somme;
    }
    public float avoirSolde(){
        return Solde;

    }
    public void afficher(){
        System.out.println("le solde est"+Solde);
    }
    public void avoieinf(){
        int getNCompt;
        float getSolde;
        String getCIN;
    }

    @Override
    public String toString() {
        return "banque{" +
                "NCompt=" + NCompt +
                ", Solde=" + Solde +
                ", CIN='" + CIN + '\'' +
                '}';
    }
}
