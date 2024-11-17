import java.io.IOException;
import java.util.Scanner;

public class bee1065 {


    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x, i, pares = 0;

        for(i = 0; i < 5; i++){
            x = sc.nextInt();
            if(x % 2 == 0){
                pares++;
            }
        }
        
        System.out.printf("%d valores pares\n", pares);

    }
}