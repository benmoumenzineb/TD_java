package TD2;

public class EX3 {
public static void main(String [] args){
livre l=new livre("larousse","dal carnigie",60,2020);
System.out.println(l.toString());
}
}
class livre{
    private String titre;
    private String auteur;
    private double prix;
    private double annee;
    livre(){}
    livre(String titre){
        this.titre=titre;
    }
    livre(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
    }
    livre(String titre,String auteur,double prix){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    livre(String titre,String auteur,double prix,double annee){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        this.annee=annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
public String getAuteur(){
        return auteur;
}

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getAnnee() {
        return annee;
    }

    public void setAnnee(){
        this.annee=annee;
    }
    public livre(livre livre) {
        this(livre.getTitre(), livre.getAuteur(), livre.getPrix(),livre.getAnnee());}

    @Override
    public String toString() {
        return "livre{" +
                "titre=" + titre +
                ", auteur=" + auteur +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }
}


