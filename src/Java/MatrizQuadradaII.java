import java.util.Scanner;

public class MatrizQuadradaII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int size = sc.nextInt();

            if (size == 0)
                break;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {

                    int valor = Math.abs(i - j) + 1;

                    if (j == 0)
                        sb.append(String.format("%3d", valor));
                    else
                        sb.append(String.format(" %3d", valor));
                }
                sb.append('\n');
            }

            sb.append('\n');
        }

        System.out.print(sb);
        sc.close();
    }
}