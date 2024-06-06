package proz.enzo.atividaderepeticao;
public class fibonacci {
    // Função iterativa para calcular o n-ésimo número de Fibonacci
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 10; // Exemplo para calcular o 10º número de Fibonacci
        System.out.println("Fibonacci de " + n + " é " + Fibonacci(n));
    }
}
