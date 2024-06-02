package proz.enzo.atividaderepeticao;

public class teste_repeticao{
    public static void main(String[] args) {
        int rep = 0;
        while (rep<11) {
            rep++;
            if (rep == 3 || rep == 9) {
                break;
                
            }
            System.out.println(rep);
           
            
        }
    }
}
