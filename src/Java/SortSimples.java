import java.util.Scanner;
import java.util.Arrays;

public class SortSimples
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int[] numeros = new int[3];
        int[] originals = new int[3];
        
        for(int i = 0; i < 3; i++)
        {
            numeros[i] = input.nextInt();
            originals[i] = numeros[i];
        }

        Arrays.sort(numeros);

        for(int i = 0; i < 3; i++)
        {
            System.out.println(numeros[i]);
        }

        System.out.println();

        for(int i = 0; i < 3; i++)
        {
            System.out.println(originals[i]);
        }
        input.close();
    }

}