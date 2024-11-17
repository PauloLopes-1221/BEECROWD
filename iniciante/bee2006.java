
import java.io.IOException;
import java.util.Scanner;

public class bee2006 {

    @SuppressWarnings({"resource", "ConvertToTryWithResources"})
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tipoCha, comp, i, acertos = 0;

        tipoCha = sc.nextInt();

        for(i = 0; i < 5; i++){
            comp = sc.nextInt();
            if(comp == tipoCha){
                acertos++;
            }
        }
        
        System.out.println(acertos);

        sc.close();
    }
}