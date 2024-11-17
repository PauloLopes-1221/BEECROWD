import java.io.IOException;
import java.util.Scanner;

public class bee1142 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            int i, n;

            n = sc.nextInt();

            for(i = 1; i <= n * 4; i++){
                if(i % 4 == 0){
                    System.out.print("PUM\n");
                    continue;
                }
                System.out.print(i + " ");
            }

            sc.close();
        }
    }
}