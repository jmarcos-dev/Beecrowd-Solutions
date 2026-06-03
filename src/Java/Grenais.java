import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golsInter, golsGremio, contaInter = 0, contaGremio = 0, empate = 0, contaGrenais = 0, escolhaUsuario = 1;
        while (escolhaUsuario == 1) {
            contaGrenais++;
            golsInter = input.nextInt();
            golsGremio = input.nextInt();
            if (golsInter > golsGremio) {
                contaInter++;
            } else if (golsGremio > golsInter) {
                contaGremio++;
            } else {
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            escolhaUsuario = input.nextInt();

        }

        System.out.println(contaGrenais + " grenais");
        System.out.println("Inter:" + contaInter);
        System.out.println("Gremio:" + contaGremio);
        System.out.println("Empates:" + empate);
        if (contaInter > contaGremio) {
            System.out.println("Inter venceu mais");
        } else if (contaGremio > contaInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        input.close();
    }

}