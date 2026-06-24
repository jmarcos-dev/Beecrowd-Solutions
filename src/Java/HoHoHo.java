package Java;

import java.util.Scanner;


public class HoHoHo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        for (int i = 0; i < entrada; i++) {
            System.out.print("Ho ");
        }
        System.out.println("!");

        input.close();
    }

}
