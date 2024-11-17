import java.io.IOException;
import java.util.Scanner;

public class bee1172 {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int i;
        int vect[] = new int[10];

        for(i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
            if(vect[i] <= 0){
                System.out.printf("x[%d] = %d\n", i, 1);            
            }
            else{
                System.out.printf("x[%d] = %d\n", i, vect[i]);
            }
            
        }

        sc.close();
    }
}