<<<<<<< Updated upstream
import java.util.Scanner;

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int valor1 = input.nextInt();
    int valor2 = input.nextInt();
    for(int i = 0; i<=valor2-1;i++)
    {
        valor1+=(1+valor2)
    }
    System.out.println(valor1);
    input.close();
}
=======
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
>>>>>>> Stashed changes
