import java.io.IOException;
import java.util.Scanner;

public class bee2160 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();

        if(nome.length() > 80){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}