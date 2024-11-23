
import java.io.IOException;
import java.util.Scanner;

public class bee1159 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x, i, soma;

        while (true) {

            x = sc.nextInt();

            if (x == 0) {
                break;
            }

            soma = 0;

            if (x % 2 != 0) {
                x++;
            }

            for (i = 0; i < 5; i++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);
        }

        sc.close();
    }
}
