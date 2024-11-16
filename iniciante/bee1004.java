import java.io.IOException;
import java.util.Scanner;
 

public class bee1004 {
 
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int prod = x * y;

            System.out.println("PROD = " + prod);
        }


    }
 
}