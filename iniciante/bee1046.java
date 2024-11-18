import java.io.IOException;
import java.util.Scanner;


public class bee1046 {
 
    public static void main(String[] args) throws IOException {
 
        try (Scanner sc = new Scanner(System.in)) {
			int initialHour, finalHour;
			
			initialHour = sc.nextInt();
			finalHour = sc.nextInt();
			
			if(initialHour > finalHour) {
				int duration = (24 - initialHour) + finalHour;
				System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);
			}
			else if(initialHour == finalHour){
				System.out.println("O JOGO DUROU 24 HORA(S)");
			}
			else {
				int duration = initialHour - finalHour;
				System.out.printf("O JOGO DUROU %d HORA(S)\n", duration * (-1));
			}
			
			sc.close();
		}
    }
 
}