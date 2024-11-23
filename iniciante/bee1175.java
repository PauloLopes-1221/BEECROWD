
import java.io.IOException;
import java.util.Scanner;

public class bee1175 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[20];
        int[] vect2 = {19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        for (int j = 19; j >= 0; j--) {
            System.out.printf("N[%d] = %d\n", vect2[j], vect[j]);
        }

        sc.close();
    }
}
