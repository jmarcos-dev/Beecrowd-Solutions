import java.util.Scanner;

public class Tridu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cartaUm = input.nextInt();
        int cartaDois = input.nextInt();
        if (cartaUm > cartaDois) {
            System.out.println(cartaUm);
        }
        else 
        {
            System.out.println(cartaDois);
        }

        input.close();
    }
}
