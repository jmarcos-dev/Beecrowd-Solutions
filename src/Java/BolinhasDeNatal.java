package Java;

import java.util.Scanner;


public class BolinhasDeNatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dots = sc.nextInt();
        int branches = sc.nextInt();
        int div = branches / 2;
        int result = div - dots;
        if (result <= 0) {
            System.out.println("Amelia tem todas bolinhas!");
        } else {
            System.out.println("Faltam "+ result + " bolinha(s)");
        }
        sc.close();
    }
}
