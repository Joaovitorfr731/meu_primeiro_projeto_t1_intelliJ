import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiro = leitor.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundo = leitor.nextInt();

        int quociente = primeiro / segundo;
        int resto = primeiro % segundo;

        System.out.println("Quociente da divisão inteira: " + quociente);
        System.out.println("Resto da divisão: " + resto);
    }
}
