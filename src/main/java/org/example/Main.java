import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = leitor.nextDouble();

        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }
}
