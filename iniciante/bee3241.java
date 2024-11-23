
import java.io.IOException;
import java.util.Scanner;

public class bee3241 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();
        sc.nextLine();

        while (n > 0) {

            String x;
            int a, b;

            x = sc.nextLine();

            if (x.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String[] vectString = x.split("\\+");
                a = Integer.parseInt(vectString[0]);
                b = Integer.parseInt(vectString[1]);
                System.out.println(a + b);
            }

            n--;
        }

        sc.close();
    }
}
