package Java;
import java.util.Scanner;

public class Salario
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int horas = input.nextInt();
        double valorHora = input.nextDouble();
        double salary = horas * valorHora;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n",salary);
    }
}
