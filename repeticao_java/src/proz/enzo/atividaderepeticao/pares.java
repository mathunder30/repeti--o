package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num1 = scan.nextInt();
        System.out.println("digite um numero: ");
        int num2 = scan.nextInt();
        
        while (num1<=num2) {
           if (num1 % 2 == 0) {
            System.out.println(num1);
            
           }
            
           num1++; 
        }

        scan.close();
    }
    
}
