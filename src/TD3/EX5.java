package TD3;

public class EX5 {
    public class Vehicule {
        private int nbPassager;
        //on initialise le nombre de passager à l'aide du constructeur
        public Vehicule(int n){//initialisation
            this.nbPassager=n;
        }


        @Override
        public String toString() {
            return "Vehicule{" +
                    "nbPassager=" + nbPassager +
                    '}';
        }
        class Moto extends Vehicule {
            //si on fait pas de constructeur super la ligne au dessus sera une erreur
            private int nbrRoues=2;


            public Moto(int n, int nbrRoues) {
                super(n);
                this.nbrRoues = nbrRoues;
            }


            public Moto(int n) {
                super(n);
            }
        }
        //un argument on met this deux arguments on met this et super
        class Avion extends Vehicule {
            private int nbrMoteur;
            public Avion(int nPr) {
                super(nPr);
            }


            public Avion(int nPr, int nbrMoteur) {
                //avc super il va declancher vehicule
                super(nPr);
                //avec this(nPr) il va declancher avion
                this.nbrMoteur = nbrMoteur;
            }
        }
        class Triporteur extends Moto{
            public Triporteur(int n) {
                super(n);
            }
            private int  nbrRoues;
            public Triporteur(int n, int nbrRoues) {
                super(n, nbrRoues);
            }
        }
    }

}
