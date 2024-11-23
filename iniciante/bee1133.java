
import java.io.IOException;
import java.util.Scanner;

public class bee1133 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            int x, y, max, min;
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }
            for (int i = min + 1; i < max; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }
    }
}
