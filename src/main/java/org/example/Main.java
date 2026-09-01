import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double valorA = leitor.nextDouble();
        System.out.print("Digite o valor de B: ");
        double valorB = leitor.nextDouble();

        System.out.println("Antes da troca: A = " + valorA + ", B = " + valorB);

        double valorTemporario = valorA;
        valorA = valorB;
        valorB = valorTemporario;

        System.out.println("Depois da troca: A = " + valorA + ", B = " + valorB);
    }
}
