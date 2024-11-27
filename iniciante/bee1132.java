import java.io.IOException;
import java.util.Scanner;
 
public class bee1132 {
 
    public static void main(String[] args) throws IOException {
 
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int x, y, min, max, i, soma = 0;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x > y) {
            max = x;
            min = y;
        } else { 
            max = y;
            min = x;
        }
        
        for(i = min; i <= max; i++) {
            if(i % 13 != 0) {
                soma += i;
            }
        }
        
        System.out.println(soma);
        
        sc.close();
    }
 
}