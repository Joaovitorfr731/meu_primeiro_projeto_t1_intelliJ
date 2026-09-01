import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double F;

        System.out.println("Digite a temperatura em C°: ");
        double C = scanner.nextDouble();

        F = (C*(9/5))+32;

        System.out.println("O valor da temperatura eh: " + F);

    }
}
