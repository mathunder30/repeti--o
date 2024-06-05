package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("digite o segundo numero: ");
        int num2 = scan.nextInt();
        while (num1<=num2) {
            if (num1 %2 == 1){
                System.out.println(num1);

            }
            num1 = num1 +1;
        }
        scan.close();
    }
    
}
