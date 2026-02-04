import java.util.Scanner;

public class entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.println(nome);
        scanner.close();

    }
}