import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int aux = 0;
        
        if( B > A)
            {
                aux = A;
                A = B; 
                B = aux;
                
            }
        int resto = A%B;
        if(resto==0)
        {
            System.out.println("Sao Multiplos");
        }
        else
        {
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}
