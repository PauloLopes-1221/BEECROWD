import java.io.IOException;
import java.util.Scanner;

public class bee2167 {

    
    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n, i, maior, pos = 0;
        
        n = sc.nextInt();

        int rpm[]= new int[n];

        for(i = 0; i < rpm.length; i++){ 
            rpm[i]= sc.nextInt();
        }

        maior = rpm[0];

        for(i = 0; i < rpm.length; i++){
            if(rpm[i] >= maior){
                maior = rpm[i];                   
            }
            if(rpm[i] < maior){
                pos = i + 1;
                break;
            }
            
        }
        
        System.out.println(pos);

        sc.close();
    }
}