
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Calcula as operações
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        
        // Exibe os resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Soma: %.2f + %.2f = %.2f%n", numero1, numero2, soma);
        System.out.printf("Subtração: %.2f - %.2f = %.2f%n", numero1, numero2, subtracao);
        System.out.printf("Multiplicação: %.2f × %.2f = %.2f%n", numero1, numero2, multiplicacao);
        System.out.printf("Divisão: %.2f ÷ %.2f = %.2f%n", numero1, numero2, divisao);
        
        scanner.close();

    }
}
