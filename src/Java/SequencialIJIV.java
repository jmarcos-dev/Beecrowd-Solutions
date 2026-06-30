package Java;

public class SequencialIJIV {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            for (double j = 1 + i; j <= 3 + i; j++) {
                if(Math.abs(i-Math.round(i))< 1e-9)
                {
                    System.out.printf("I=%.0f ",i);
                }
                else
                {
                    System.out.printf("I=%.1f ",i);
                }
                if(Math.abs(j-Math.round(j))< 1e-9)
                {
                    System.out.printf("J=%.0f",j);
                    System.out.println();
                }
                else
                {
                    System.out.printf("J=%.2f",i);
                    System.out.println();
                }
            }
        }
    }
}
