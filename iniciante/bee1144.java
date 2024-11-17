import java.io.IOException;
import java.util.Scanner;

public class bee1144 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n, i;

        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + ((i * i) + 1) + " " + ((i * i * i) + 1));
        }


    }
}