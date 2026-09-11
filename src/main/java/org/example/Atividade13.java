package org.example;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da transação: R$ ");
        double valorTransacao = scanner.nextDouble();

        if (valorTransacao > 10000) {
            System.out.println("Transação suspeita. Enviar para análise.");
        } else {
            System.out.println("Transação não suspeita.");
        }

        scanner.close();
    }
}

