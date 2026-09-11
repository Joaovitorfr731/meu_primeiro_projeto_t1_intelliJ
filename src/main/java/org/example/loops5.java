package org.example;

import java.util.Scanner;

public class loops5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        String continuar;

        do {
            System.out.print("Digite o valor do produto: R$ ");
            double valorProduto = scanner.nextDouble();

            total += valorProduto;

            System.out.print("Deseja registrar outro produto? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.printf("%nTotal da compra: R$ %.2f%n", total);

        scanner.close();
    }
}

