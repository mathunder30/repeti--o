package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class adivinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        boolean AdivinhaNum = true;

        while (AdivinhaNum) {
            System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
            System.out.println("Voce precisa adivinha o numero: ");
            if(num1==20){
                System.out.println("Voce acertou!!");

            }  else if (num1 <= 19 && num1>=15 ){
                System.out.println("Você esta perto, tente novamente!");

            }
            
            else if( num1 >=21 && num1 <= 30){
                System.out.println("Você esta perto, tente novamente!");


            }else if(num1!=20){
                System.out.println("Voce errou, tente novamente!");}
            
            else{
                System.out.println("Voce digitou errado, tente novamente");
            }
            
        }
        
        scan.close();
    }
    
}
