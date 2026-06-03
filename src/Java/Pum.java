import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorEntrada = input.nextInt();
        int a=1, b,c;
        while (valorEntrada!=0) {
            b =a+1;
            c =b+1;
            System.out.println(a + " " + b + " " + c + " PUM");

            a=c+2;

            valorEntrada--;
        }
        input.close();
    }
}