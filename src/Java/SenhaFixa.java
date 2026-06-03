import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha;
        while (input.hasNextInt()) {
            senha = input.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
            else
            {
                System.out.println("Senha Invalida");
            }
        }
    }
}
