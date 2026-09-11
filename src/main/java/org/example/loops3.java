package org.example;

import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int venda = 1;
        double total = 0;

        while (venda <= 5) {
            System.out.print("Digite o valor da venda " + venda + ": R$ ");
            double valorVenda = scanner.nextDouble();

            total += valorVenda;
            venda++;
        }

        System.out.printf("%nFaturamento total do dia: R$ %.2f%n", total);

        scanner.close();
    }
}

