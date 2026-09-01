import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = leitor.nextDouble();
        System.out.print("Digite o total de combustível gasto em litros: ");
        double combustivel = leitor.nextDouble();

        double consumo = distancia / combustivel;
        System.out.println("O consumo médio é: " + consumo + " km/l");
    }
}
