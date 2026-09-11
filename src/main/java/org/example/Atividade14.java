package org.example;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio mensal: R$ ");
        double saldoMedio = scanner.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Isenção de tarifa bancária concedida.");
        } else {
            System.out.println("Tarifa bancária mantida.");
        }

        scanner.close();
    }
}

