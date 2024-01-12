package TD3;

public class EX6 {
    public abstract class Figure {
        private double nom;
        private double rayon;
        public double getPerimtere(){
            return 3.14 * this.rayon;
        }
        public double getAir(){
            return Math.pow(this.rayon,2*3.14);
        }


        @Override
        public String toString() {
            return "Figure{" +
                    "nom='" + nom + '\'' +
                    '}';
        }
        class Disque extends Figure{
            private double centre;
            private double rayon;
            public Disque(){}
            public Disque(double centre,double rayon){
                this.centre=centre;
                this.rayon=rayon;
            }




            public double getCentre() {
                return centre;
            }


            public void setCentre(double centre) {
                this.centre = centre;
            }
            public double getRayon(){
                return rayon;
            }


            public void setRayon(double rayon) {
                this.rayon = rayon;
            }


        }
        class Regtangle extends Figure{
            double longueur;
            double largeur;


            public Regtangle(double longueur) {
                this.longueur = longueur;
            }



        }
    }



}
