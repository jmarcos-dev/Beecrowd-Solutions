import java.util.Scanner;

public class Pneu {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pressaoMotorista = input.nextInt();
        int pressaoCarro = input.nextInt();
        int pressaoFinal = pressaoMotorista-pressaoCarro;
        System.out.println(pressaoFinal);

        input.close();

    }
}
