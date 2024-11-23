
import java.io.IOException;
import java.util.Scanner;

public class bee1143 {

    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i, n;

        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n", i, i * i, i * i * i);
        }

        sc.close();
    }
}
