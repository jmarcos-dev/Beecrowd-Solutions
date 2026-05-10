package Java;
import java.util.Scanner;
public class MediaDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();
        double media = ((value1*2)+(value2*3)+(value3*5))/10;
        System.out.printf("MEDIA = %.1f%n",media);

    }
}
