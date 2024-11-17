import java.io.IOException;
import java.util.Scanner;

public class bee1177 {

    @SuppressWarnings({"resource", "ConvertToTryWithResources"})
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t, i, x = 0;
        int vect[] = new int[1000];

        t = sc.nextInt();

        for(i = 0; i < vect.length; i++){
            
            System.out.printf("N[%d] = %d\n", i, x);
            x++;
            if(x == t){
                x = 0;
            }
        }



        sc.close();
    }
}