import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 

public class bee1042 {
 
    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i;
        int[] vect = new int[3];

        for(i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        int[] vectSort = vect.clone();


        Arrays.sort(vectSort);

        for(i = 0; i < vectSort.length; i++) {
            System.out.println(vectSort[i]);       
        }

        System.out.println();

        for(i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        sc.close();
    }

}

