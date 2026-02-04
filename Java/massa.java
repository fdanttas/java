import java.util.Scanner;

public class massa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = sc.nextDouble();

        if (altura <= 0) {
            System.out.println("Altura inválida.");
            sc.close();
            return;
        }

        double imc = peso / (altura * altura);
        System.out.printf("IMC = %.2f%n", imc);

        sc.close();
    }

}
