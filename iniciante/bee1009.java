import java.io.IOException;
import java.util.Scanner;
 
public class bee1009 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioFixo, salarioFinal, vendas;

        nome = sc.nextLine();
        salarioFixo = sc.nextDouble();
        vendas = sc.nextDouble();

        salarioFinal = salarioFixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);


        sc.close();
    }
}
