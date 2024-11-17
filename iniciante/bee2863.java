import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 
//RESULTADO SAI COMO ESPERADO, MAS ESTA DANDO RUNTIME ERROR NO BEECROWD.
//AINDA NAO DESCOBRI A CAUSA DO ERRO.


public class bee2863 {
 

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cont;
        int i;       
        double tempo, menorTempo = 11.1;

        while((cont = br.readLine()) != null) {

            int t = Integer.parseInt(cont);

            for(i = 0; i < t; i++){
                tempo = sc.nextDouble();
                if(tempo < menorTempo){
                    menorTempo = tempo;
                }     
            }
            System.out.println(menorTempo);
        }
       
        sc.close();
    }
}