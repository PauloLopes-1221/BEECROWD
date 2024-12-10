
import java.io.IOException;
import java.util.Scanner;

public class bee1072 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n, x, in = 0, out = 0;

        n = sc.nextInt();

        while (n > 0) {

            x = sc.nextInt();

            if ((x >= 10 && x <= 20)) {
                in++;
            } else {
                out++;
            }

            n--;
        }

        System.out.printf("%d in\n%d out\n", in, out);

        sc.close();
    }
}
