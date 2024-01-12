package TD3;

public class EX7 {
    // Classe abstraite Employe
    public abstract class Employe {
        protected String nom;
        protected String prenom;

        public Employe() {}

        public Employe(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        @Override
        public String toString() {
            return "Employe{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }

        public abstract double gains();
    }

    // Classe Patron
    public class Patron extends Employe {
        private double salaire;

        public Patron() {}

        public Patron(String nom, String prenom, double salaire) {
            super(nom, prenom);
            this.salaire = salaire;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        @Override
        public String toString() {
            return "Patron{" +
                    "salaire=" + salaire +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }

        @Override
        public double gains() {
            return salaire;
        }
    }

    // Classe TravailleurCommission
    public class TravailleurCommission extends Employe {
        private double salaire;
        private double commission;
        private int quantite;

        public TravailleurCommission() {}

        public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
            super(nom, prenom);
            this.salaire = salaire;
            this.commission = commission;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        public double getCommission() {
            return commission;
        }

        public void setCommission(double commission) {
            this.commission = commission;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        @Override
        public String toString() {
            return "TravailleurCommission{" +
                    "salaire=" + salaire +
                    ", commission=" + commission +
                    ", quantite=" + quantite +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }

        @Override
        public double gains() {
            return salaire + commission * quantite;
        }
    }

    // Classe TravailleurHoraire
    public class TravailleurHoraire extends Employe {
        private double retribution;
        private int heures;

        public TravailleurHoraire() {}

        public TravailleurHoraire(String nom, String prenom, double retribution) {
            super(nom, prenom);
            this.retribution = retribution;
        }

        public double getRetribution() {
            return retribution;
        }

        public void setRetribution(double retribution) {
            this.retribution = retribution;
        }

        public int getHeures() {
            return heures;
        }

        public void setHeures(int heures) {
            this.heures = heures;
        }

        @Override
        public String toString() {
            return "TravailleurHoraire{" +
                    "retribution=" + retribution +
                    ", heures=" + heures +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }

        @Override
        public double gains() {
            return retribution * heures;
        }
    }

    // Classe de test
    public class TestEmploye {
        public void main(String[] args) {
            Patron patron = new Patron("salmi", "ahmed", 5000);
            System.out.println(patron);
            System.out.println("Gains: " + patron.gains());

            TravailleurCommission travailleurCommission = new TravailleurCommission("ben", "assiya", 2000, 50);
            travailleurCommission.setQuantite(20);
            System.out.println(travailleurCommission);
            System.out.println("Gains: " + travailleurCommission.gains());

            TravailleurHoraire travailleurHoraire = new TravailleurHoraire("oumaima", "safi", 20);
            travailleurHoraire.setHeures(160);
            System.out.println(travailleurHoraire);
            System.out.println("Gains: " + travailleurHoraire.gains());
        }
    }

}
