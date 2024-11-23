
import java.io.IOException;
import java.util.Scanner;

public class bee1099 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        while (n > 0) {

            int x, y, i, maior, menor;

            x = sc.nextInt();
            y = sc.nextInt();

            if (x > y) {
                maior = x;
                menor = y;
            } else {
                maior = y;
                menor = x;
            }

            int soma = 0;

            for (i = menor + 1; i < maior; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.println(soma);

            n--;
        }

        sc.close();

    }
}
