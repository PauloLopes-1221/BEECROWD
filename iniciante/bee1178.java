
import java.io.IOException;
import java.util.Scanner;

public class bee1178 {

    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i;
        double x;
        double[] vect = new double[100];

        x = sc.nextDouble();
        vect[0] = x;

        System.out.printf("N[0] = %.4f\n", x);

        for (i = 1; i <= 99; i++) {
            vect[i] = vect[i - 1] / 2;
            System.out.printf("N[%d] = %.4f\n", i, vect[i]);
        }

        sc.close();
    }
}
