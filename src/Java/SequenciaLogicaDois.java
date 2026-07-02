package Java;

public class SequenciaLogicaDois {
    public static void main(String[] args) {
        int numero = 1;
    
        for (int i = 0; i < 33; i++) {      // linhas
            for (int j = 0; j < 3; j++) {  // colunas
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
    }
}