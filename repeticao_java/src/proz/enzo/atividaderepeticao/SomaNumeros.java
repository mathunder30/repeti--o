package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int aux=0;
        while (aux < 5) {
            System.out.println("digite um numero");
            int numero = scan.nextInt();
            
            soma = soma + numero;
            System.out.println(soma);
            aux++;
           
        }
        
        scan.close();
    }
    
}
