import java.util.Scanner;

public class TipodeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int combustivel = input.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;
        while (combustivel != 4) {
            combustivel = input.nextInt();
            if (combustivel == 1) {
                alcool++;
            } else if (combustivel == 2) {
                gasolina++;
            } else if (combustivel == 3) {
                diesel++;
            }

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        input.close();
    }
}
