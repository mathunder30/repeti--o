package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class media_nota {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int soma = 0;
            int aux=0;
            while (aux < 5) {
                System.out.println("digite um numero");
                int numero = scan.nextInt();
                
                if(numero>=0){
                soma = soma + numero;
                System.out.println("a soma é: "+soma);
                aux++;
                } else if(numero <=0){
                    System.out.println("numero negativo somando. saindo...");
                    break;
                } int somar =+ soma;
                double media = somar/ aux;
                System.out.println("a media é: "+ media);
                
                
            }
            
            scan.close();
        }
    }
    
