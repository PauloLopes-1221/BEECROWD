
import java.io.IOException;
import java.util.Scanner;

public class bee1157 {

    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i, n;

        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
