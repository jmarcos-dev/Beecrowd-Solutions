
import java.util.Scanner;

public class ReservatorioDeMel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = 0.0, area = 0.0, n = 3.14, raio = 0;
        while (sc.hasNextLine()) {
            double volume = sc.nextDouble();
            double diametro = sc.nextDouble();
            raio = diametro / 2;
            altura = (volume / n) / (raio * raio);
            area = n * (raio * raio);

            System.out.printf("ALTURA = %.2f%n", altura);
            System.out.printf("AREA = %.2f%n", area);
        }
        sc.close();
    }
}
