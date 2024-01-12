package TD3;
public class EX4 {
        public void main(String[] args) {
Batiment b =new Batiment();
b.setAdresse("settat");
System.out.println(b.toString());
Maison m =new Maison("casa",5);
m.setNbrchambre(7);
System.out.println(b.toString());
Immeuble i =new Immeuble(8);
System.out.println(b.toString());
        }
}

class Batiment {
    private String adresse;
    public Batiment(){}
    public Batiment(String adresse){
this.adresse=adresse;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
class Maison extends Batiment {
    private int nbrchambre;

    public Maison(int nbrchambre) {
        super();//on a le choix s'utiliser super ou this les deux sont vrai on une seul variable
        this.nbrchambre = nbrchambre;
    }

    public Maison(String adresse, int nbrchambre) {
        super(adresse);//ici on a une nouvelle variable qui n'exixste pas dans le constructeur de la classe mère donc on doit utiliser this
        this.nbrchambre = nbrchambre;
    }

    public int getNbrchambre() {
        return nbrchambre;
    }

    public void setNbrchambre(int nbrchambre) {
        this.nbrchambre = nbrchambre;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbrchambre=" + nbrchambre +
                '}';
    }
}
    class Immeuble extends Batiment {
        private int nbrappart;

        public Immeuble(int nbrappart) {
            this.nbrappart = nbrappart;
        }

        public Immeuble(String adresse, int nbrappart) {
            this.nbrappart = nbrappart;
        }

        public int getNbrappart() {
            return nbrappart;
        }

        public void setNbrappart(int nbrappart) {
            this.nbrappart = nbrappart;
        }

        @Override
        public String toString() {
            return "Immeuble{" +
                    "nbrappart=" + nbrappart +
                    '}';
        }
    }


