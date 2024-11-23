
import java.io.IOException;
import java.util.Scanner;

public class bee1145 {

    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int x, y, i;

        x = sc.nextInt();
        y = sc.nextInt();

        for (i = 1; i <= y; i++) {
            System.out.print(i);
            if (i % x == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
