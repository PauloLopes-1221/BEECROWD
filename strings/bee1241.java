package strings;

import java.io.IOException;
import java.util.Scanner;

public class bee1241 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        while (n > 0) {

            String a, b;

            a = sc.next();
            b = sc.next();

            if (a.endsWith(b)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }

            n--;
        }

        sc.close();
    }
}
