import java.io.IOException;
import java.util.Scanner;

public class bee1078 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int i, n;

        n = sc.nextInt();

        for(i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, n, i * n);
        }





        sc.close();

    }
}