import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        double reajuste = 0, novoSalario=0;
        int percentual=0;
        if (salario >= 0 && salario<=400.00) {
            reajuste = (salario*0.15);
            novoSalario= reajuste+salario;
            percentual=15;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: "+ percentual+ " %");
        }
        else if (salario >= 400.01 && salario <= 800.00) {
            reajuste = (salario*0.12);
            novoSalario= reajuste+salario;
            percentual=12;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: "+ percentual+ " %");
        }
        else if (salario >= 800.01 && salario <= 1200.00) {
            reajuste = (salario*0.10);
            novoSalario= reajuste+salario;
            percentual=10;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: "+ percentual+ " %");
        }
        else if (salario >= 1200.01 && salario<=2000.00) {
            reajuste = (salario*0.07);
            novoSalario= reajuste+salario;
            percentual=7;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: "+ percentual+ " %");
        }
        else if (salario > 2000) {
            reajuste = (salario*0.04);
            novoSalario= reajuste+salario;
            percentual=4;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: "+ percentual+ " %");
        }
        input.close();

    }
    
}
