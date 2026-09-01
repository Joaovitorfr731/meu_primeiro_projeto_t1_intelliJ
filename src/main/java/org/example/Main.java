import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = leitor.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horas = leitor.nextDouble();

        double salarioBruto = valorHora * horas;
        System.out.println("O salário bruto é: " + salarioBruto);
    }
}
