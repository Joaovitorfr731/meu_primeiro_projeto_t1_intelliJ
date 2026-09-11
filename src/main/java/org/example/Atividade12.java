package org.example;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a renda mensal: R$ ");
        double rendaMensal = scanner.nextDouble();

        System.out.print("Digite o score de crédito: ");
        int scoreCredito = scanner.nextInt();

        if (rendaMensal > 8000 && scoreCredito > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium recusado.");
        }

        scanner.close();
    }
}