import java.io.IOException;
import java.util.Scanner;

public class bee1070 {

    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int x, i;

        x = sc.nextInt();

        for(i = x; i < x + 12; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }


        sc.close();
    }
}