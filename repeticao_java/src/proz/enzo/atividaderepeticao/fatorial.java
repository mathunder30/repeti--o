package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = scan.nextInt();
        double aux = num-1;
        while (aux>0) {
            num*=aux;
            aux--;
        }
        System.out.println(num);

        scan.close();
    }
    
}
