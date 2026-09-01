import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = leitor.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);
    }
}
