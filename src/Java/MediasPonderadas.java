import java.util.Scanner;


public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        double valor1 = 0.0, valor2 = 0.0, valor3 = 0.0, media=0.0;
        for(int i = 0; i <=casos; i++)
        {
            valor1 = input.nextDouble();
            valor2 = input.nextDouble();
            valor3 = input.nextDouble();
            media = ((valor1*2)+(valor2*3)+(valor3*5))/10;
            System.out.printf("%.1f%n",media);
        }
        input.close();
    }
}
