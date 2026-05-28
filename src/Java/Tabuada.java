import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("1 x " + a + " = " + a*1);
        System.out.println("2 x " + a + " = " + a*2);
        System.out.println("3 x " + a + " = " + a*3); 
        System.out.println("4 x " + a + " = " + a*4);
        System.out.println("5 x " + a + " = " + a*5);
        System.out.println("6 x " + a + " = " + a*6);
        System.out.println("7 x " + a + " = " + a*7);
        System.out.println("8 x " + a + " = " + a*8);
        System.out.println("9 x " + a + " = " + a*9);
        System.out.println("10 x " + a + " = " + a*10);

        input.close();
    }
}
