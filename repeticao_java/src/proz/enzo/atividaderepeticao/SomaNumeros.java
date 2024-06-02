package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int contador = 1;
        System.out.println("digite um numero");
        while (soma <= 5) {
            System.out.println("digite um numero: " +contador );
            int numero = scan.nextInt();
            soma += numero;
            contador++;
            
           
        }
        System.out.println(soma);
        scan.close();
    }
    
}
