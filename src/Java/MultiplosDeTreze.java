import java.util.Scanner;

public class MultiplosDeTreze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorX = input.nextInt();
        int valorY = input.nextInt();
        int contaI = 0, aux=0;
        if (valorX > valorY) {
            aux = valorX;
            valorX = valorY;
            valorY = aux;
        }
        for(int i = valorX; i <= valorY; i++ )
        {
            if (i%13!=0) {
                contaI+=i;
            }
        }
        System.out.println(contaI);
        input.close();
    }    
}
