import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = leitor.nextDouble();

        double novoValor = valor * 0.85;
        System.out.println("O novo valor do produto é: " + novoValor);
    }
}
