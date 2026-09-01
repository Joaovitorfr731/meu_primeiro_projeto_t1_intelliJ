import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capital = leitor.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double taxa = leitor.nextDouble();
        System.out.print("Digite o tempo em meses: ");
        double tempo = leitor.nextDouble();

        double juros = capital * (taxa / 100) * tempo;
        double montante = capital + juros;

        System.out.println("Os juros são: " + juros);
        System.out.println("O montante final é: " + montante);
    }
}
