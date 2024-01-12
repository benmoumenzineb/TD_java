package TD1;
import java.util.Scanner;
public class EX2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez la valeur de a :");
            double a = scanner.nextDouble();

            System.out.println("Entrez la valeur de b :");
            double b = scanner.nextDouble();

            System.out.println("Entrez la valeur de c :");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;
            double sqrt_val = Math.sqrt(Math.abs(discriminant));

            if (discriminant > 0) {
                System.out.println("Les racines sont réelles et différentes");
                System.out.println((-b + sqrt_val) / (2 * a) + " et " + (-b - sqrt_val) / (2 * a));
            } else if (discriminant == 0) {
                System.out.println("Les racines sont réelles et égales");
                System.out.println(-b / (2 * a));
            } else {
                System.out.println("Les racines sont complexes et différentes");
                System.out.println(-b / (2 * a) + " + i" + sqrt_val);
                System.out.println(-b / (2 * a) + " - i" + sqrt_val);
            }
        }
    }


