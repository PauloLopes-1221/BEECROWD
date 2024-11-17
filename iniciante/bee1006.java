import java.io.IOException;
import java.util.Scanner;

public class bee1006 {
 
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        double a, b ,c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double m = (((a * 2) + (b * 3) + (c * 5)) / 10);

        System.out.printf("MEDIA = %.1f\n", m);
    }
 
}