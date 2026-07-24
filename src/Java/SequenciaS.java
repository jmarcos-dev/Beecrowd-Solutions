package Java;

public class SequenciaS {

    public static void main(String[] args) {
        double S = 0;
        for (double i = 1; i <= 100; i++) {
            S += 1 / i;

        }
        System.out.printf("%.2f%n", S);
    }
}
