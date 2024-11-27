
import java.io.IOException;
import java.util.Scanner;

public class bee1165 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        while (n > 0) {

            int x, i, soma = 0;

            x = sc.nextInt();

            for (i = 1; i <= x; i++) {
                if (x % i == 0) {
                    soma++;
                }
            }

            if (soma > 2) {
                System.out.printf("%d nao eh primo\n", x);
            } else {
                System.out.printf("%d eh primo\n", x);
            }

            n--;
        }

        sc.close();
    }
}
