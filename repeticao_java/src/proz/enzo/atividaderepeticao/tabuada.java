package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero = scan.nextInt();
        int multi = 0;
        while(multi <=10){
            int valor = multi*numero;
            System.out.println(valor);
            multi++;

            
        }

        scan.close();
    }
    
    
    
}
