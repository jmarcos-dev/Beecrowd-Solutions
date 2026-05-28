import java.util.Scanner;

public class BobConduite{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for(int i = 0; i < casos; i++)
        {
            int valor1 = input.nextInt();
            int valor2 = input.nextInt();
            int total = valor1+valor2;
            System.out.println(total);
        
        }
        input.close();

    }
}