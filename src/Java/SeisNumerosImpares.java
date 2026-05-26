package Java;

<<<<<<< HEAD
=======
import javax.xml.transform.Source;
>>>>>>> 6f68796 (Resolvido 2752, 1067, 1070, 1197)
import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
        int val = input.nextInt();

        for (int i = 0; i <= 6; i++) {
            if (val % 2 != 0) {
                System.out.println(val);
            }
            val++;
            
        }

    }
=======
        int valor = input.nextInt();
        if (valor % 2 == 0) {
            valor++;

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(valor);
            valor += 2;
        }
        input.close();
    }


>>>>>>> 6f68796 (Resolvido 2752, 1067, 1070, 1197)
}
