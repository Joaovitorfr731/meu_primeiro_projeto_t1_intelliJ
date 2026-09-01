import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade total de segundos: ");
        int totalSegundos = leitor.nextInt();

        int horas = totalSegundos / 3600;
        int restantes = totalSegundos % 3600;
        int minutos = restantes / 60;
        int segundos = restantes % 60;

        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}
