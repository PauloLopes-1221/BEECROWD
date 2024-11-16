import java.io.IOException;
import java.util.Scanner;
 
public class bee1067 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x, i;

        x = sc.nextInt();

        for(i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
