
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bee1040 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.0");
            double n1, n2, n3, n4;
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            n4 = sc.nextDouble();
            double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4)) / 10;
            if (media >= 7) {
                System.out.println("Media: " + df.format(media));
                System.out.println("Aluno aprovado.");
            } else if (media < 5) {
                System.out.println("Media: " + df.format(media));
                System.out.println("Aluno reprovado.");

            } else if (media >= 5 || media <= 6.9) {
                System.out.println("Media: " + df.format(media));
                System.out.println("Aluno em exame.");
                double notaExame = sc.nextDouble();
                double mediaFinal = (media + notaExame) / 2;
                if (mediaFinal >= 5) {
                    System.out.println("Aluno aprovado.");
                    System.out.println("Media final: " + df.format(mediaFinal));
                } else {
                    System.out.println("Aluno reprovado.");
                    System.out.println("Media final: " + df.format(mediaFinal));
                }
            }
        }
    }

}
