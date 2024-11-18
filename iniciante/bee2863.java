
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee2863 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cont;

        while ((cont = br.readLine()) != null) { 

            int t = Integer.parseInt(cont); 
            
            double menorTempo = Double.MAX_VALUE; 

            for (int i = 0; i < t; i++) {
                double tempo = Double.parseDouble(br.readLine()); 
                if (tempo < menorTempo) {
                    menorTempo = tempo;
                }
            }

            System.out.println(menorTempo);

        }
    }
}
