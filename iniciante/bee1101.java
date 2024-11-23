
import java.io.IOException;
import java.util.Scanner;

public class bee1101 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            int m, n;
            while (true) {

                m = sc.nextInt();
                if (m <= 0) {
                    break;
                }

                n = sc.nextInt();
                if (n <= 0) {
                    break;
                }

                int soma = 0;

                if (n > m) {
                    for (int i = m; i <= n; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }

                    System.out.println("Sum=" + soma);
                }

                if (m > n) {
                    for (int i = n; i <= m; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }

                    System.out.println("Sum=" + soma);
                }

            }
        }
    }

}
