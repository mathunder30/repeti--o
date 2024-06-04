package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multi = 0;
        int aux = 0;
        while(aux <10){
            System.out.println("digite um numero");
            int numero = scan.nextInt();

            multi = multi + numero;
            System.out.println(multi);
            aux++;

            
        }

        scan.close();
    }
    
    
    
}
