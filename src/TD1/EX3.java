package TD1;
import java.util.Scanner;
public class EX3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez le premier nombre :");
            int a = scanner.nextInt();

            System.out.println("Entrez le deuxième nombre :");
            int b = scanner.nextInt();

            System.out.println("Choisissez une option :");
            System.out.println("1. Savoir si la somme a + b est paire");
            System.out.println("2. Savoir si le produit ab est pair");
            System.out.println("3. Connaître le signe de la somme a + b");
            System.out.println("4. Connaître le signe du produit ab");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if ((a + b) % 2 == 0) {
                        System.out.println("La somme a + b est paire");
                    } else {
                        System.out.println("La somme a + b est impaire");
                    }
                    break;
                case 2:
                    if ((a * b) % 2 == 0) {
                        System.out.println("Le produit ab est pair");
                    } else {
                        System.out.println("Le produit ab est impaire");
                    }
                    break;
                case 3:
                    if ((a + b) > 0) {
                        System.out.println("La somme a + b est positive");
                    } else if ((a + b) < 0) {
                        System.out.println("La somme a + b est négative");
                    } else {
                        System.out.println("La somme a + b est nulle");
                    }
                    break;
                case 4:
                    if ((a * b) > 0) {
                        System.out.println("Le produit ab est positif");
                    } else if ((a * b) < 0) {
                        System.out.println("Le produit ab est négatif");
                    } else {
                        System.out.println("Le produit ab est nul");
                    }
                    break;
                default:
                    System.out.println("Option non valide");
            }
        }
    }


