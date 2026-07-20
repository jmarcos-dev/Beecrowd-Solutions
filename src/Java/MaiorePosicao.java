import java.util.Scanner;


public class MaiorePosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0, i, posicao = 0;
        for (i = 0; i < 100; i++) {
            int valor = sc.nextInt();


            if (valor > aux) {
                aux = valor;
                posicao = i+1;
            }
        }
        System.out.println(aux);
        System.out.println(posicao);
        sc.close();
    }
}
