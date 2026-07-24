
import java.io.DataInputStream;
import java.io.IOException;

public class Senha {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        while (true) {
            int valores = dis.readInt();
            if (valores == 0) {
                break;
            }
            System.out.println(valores - 1);

        }
    }
}
