package proz.enzo.atividaderepeticao;

import java.util.Scanner;

public class primos {
  public static boolean Primos(int number){
    if (number <=1 ) {
        return false; // 0 e 1 não são primos
        
    }
    int aux = 2;
    while (aux <= Math.sqrt(number)){
        if (number % aux == 0) {
            return false;
            
        }  
        aux++;  
    }
    return true;
  }


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int n = scan.nextInt();
    if (Primos(n)) {
        System.out.println(n+" é um numero primo");
        
    } else{
        System.out.println(n+" não é um numero primo");
    }

    scan.close();
}
}


