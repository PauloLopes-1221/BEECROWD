import java.io.IOException;
import java.util.Scanner;

public class bee1060 {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double n;
        int i, soma = 0;

        for(i = 0; i < 6; i++){
            n = sc.nextDouble();
            if(n > 0){
                soma++;
            }
        }
        System.out.println(soma + " valores positivos");
    }
}
