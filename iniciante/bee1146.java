
import java.io.IOException;
import java.util.Scanner;

public class bee1146 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x, i;

        while (true) {

            x = sc.nextInt();

            if (x == 0) {
                break;
            }

            for (i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }

            }

        }

        sc.close();
    }
}
