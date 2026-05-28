import java.util.Scanner;

public class NotaEsquecida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int notaEsquecida = (B*2)-A;
        System.out.println(notaEsquecida);

        input.close();
    }
}
