import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int hi = input.nextInt();
        int mi = input.nextInt();
        int hf = input.nextInt();
        int mf = input.nextInt();

        if (hi == hf && mi == mf && hi==mi)  {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");            
        }
        //else if(hi )

    }
}
