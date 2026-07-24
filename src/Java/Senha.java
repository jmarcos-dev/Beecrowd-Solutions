package Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Senha {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        while (true) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                break;
            }

            for (int i = 1; i <= x; i++) {
                if (i > 1) {
                    out.append(" ");
                }
                out.append(i);
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}
