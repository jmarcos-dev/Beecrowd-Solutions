
import java.util.Scanner;

public class SequenciaLogicaDois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns = sc.nextInt();
        int rows = sc.nextInt();
        int numero = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numero + " ");
                numero++;
                if (numero == rows)
                 {
                    break;
                }
            
            
            }
            System.out.println();
        }
    }
}
