package Java;
import java.util.Scanner;
public class SomandoInteirosConsecutivos {
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int N = input.nextInt();
        int soma=0;
        while(N <=0)
        {
            N = input.nextInt();
        }
        for (int i = 0; i<N;i++)
        {
            soma += A+i;

        }
        System.out.println(soma);

        input.close();

    }

}