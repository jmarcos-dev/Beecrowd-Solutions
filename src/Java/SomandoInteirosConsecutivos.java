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