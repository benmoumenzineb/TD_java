package TD1;
import java.util.Scanner;
public class EX1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez le premier nombre :");
            int num1 = scanner.nextInt();

            System.out.println("Entrez le deuxième nombre :");
            int num2 = scanner.nextInt();

            System.out.println("Entrez le troisième nombre :");
            int num3 = scanner.nextInt();

            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }

            System.out.println("Le maximum des trois nombres est : " + max);
        }
    }


