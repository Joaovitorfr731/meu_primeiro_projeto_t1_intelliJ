package org.example;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor investido: R$ ");
        double valorInvestido = scanner.nextDouble();

        String categoria;

        if (valorInvestido <= 10000) {
            categoria = "Bronze";
        } else if (valorInvestido <= 50000) {
            categoria = "Prata";
        } else if (valorInvestido <= 100000) {
            categoria = "Ouro";
        } else {
            categoria = "Platinum";
        }

        System.out.println("Categoria do cliente: " + categoria);

        scanner.close();
    }
}

