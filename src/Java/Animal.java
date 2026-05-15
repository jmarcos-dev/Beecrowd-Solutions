import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String tipo1 = input.nextLine();
        String tipo2 = input.nextLine();
        String tipo3 = input.nextLine();

        if (tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnivoro")) {
            System.out.println("aguia");
        }
        else if (tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")) {
            System.out.println("pomba");
        }
        else if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
            System.out.println("homem");
        }
        else if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
            System.out.println("vaca");
        }
        else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")) {
            System.out.println("pulga");
        }
        else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro")) {
            System.out.println("lagarta");
        }
        else if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
            System.out.println("sanguessuga");
        }
        else if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
            System.out.println("minhoca");
        }

        input.close();
    }
}