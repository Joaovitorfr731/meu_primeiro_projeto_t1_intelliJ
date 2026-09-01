import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = leitor.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = leitor.nextDouble();

        double perimetro = 2 * (base + altura);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
