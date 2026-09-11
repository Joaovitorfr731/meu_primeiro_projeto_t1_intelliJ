package org.example;

import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cliente = 1;
        int quantidadeAvaliacoes = 0;

        while (cliente <= 10) {
            System.out.print("Digite a nota de satisfação do cliente " + cliente + ": ");
            double nota = scanner.nextDouble();

            quantidadeAvaliacoes++;
            cliente++;
        }

        System.out.println("\nQuantidade de avaliações registradas: "
                + quantidadeAvaliacoes);

        scanner.close();
    }
}

