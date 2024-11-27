import java.io.IOException;
import java.util.Scanner;
 
public class bee1155 {
 
    public static void main(String[] args) throws IOException {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        double s = 0;
        int i;
        
        for(i = 1; i <= 100; i++){
            s += 1.00 / i;
        }
        System.out.printf("%.2f\n", s);
        
        sc.close();
    }
 
}