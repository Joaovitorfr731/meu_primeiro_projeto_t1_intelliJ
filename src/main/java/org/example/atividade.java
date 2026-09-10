package org.example;
import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        int tempoEmpresa;
        int quantidadeFilhos;
        String modalidade;
        String veiculoProprio;

        System.out.println("=== SISTEMA DE CONSULTA DE BENEFÍCIOS ===");

        System.out.print("Nome do colaborador: ");
        nome = scanner.nextLine();

        System.out.print("Idade: ");
        idade = scanner.nextInt();

        System.out.print("Salário: R$ ");
        salario = scanner.nextDouble();

        System.out.print("Tempo de empresa em meses: ");
        tempoEmpresa = scanner.nextInt();

        System.out.print("Quantidade de filhos: ");
        quantidadeFilhos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modalidade de trabalho (presencial/home office): ");
        modalidade = scanner.nextLine().toLowerCase();

        System.out.print("Utiliza veículo próprio? (sim/nao): ");
        veiculoProprio = scanner.nextLine().toLowerCase();

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Colaborador: " + nome);
        System.out.println("Idade: " + idade + " anos");

        // Vale-alimentação: salário de até R$ 8.000,00
        if (salario <= 8000) {
            System.out.println("Vale-alimentação: SIM");
        } else {
            System.out.println("Vale-alimentação: NÃO");
        }

        // Auxílio-creche: possui pelo menos um filho
        if (quantidadeFilhos > 0) {
            System.out.println("Auxílio-creche: SIM");
        } else {
            System.out.println("Auxílio-creche: NÃO");
        }

        // Plano de saúde: pelo menos 6 meses de empresa
        if (tempoEmpresa >= 6) {
            System.out.println("Plano de saúde: SIM");
        } else {
            System.out.println("Plano de saúde: NÃO");
        }

        // Auxílio home office: trabalha em home office
        if (modalidade.equals("home office")) {
            System.out.println("Auxílio home office: SIM");
        } else {
            System.out.println("Auxílio home office: NÃO");
        }

        // Auxílio combustível: veículo próprio e trabalho presencial
        if (veiculoProprio.equals("sim") && modalidade.equals("presencial")) {
            System.out.println("Auxílio combustível: SIM");
        } else {
            System.out.println("Auxílio combustível: NÃO");
        }

        // PLR: pelo menos 12 meses de empresa
        if (tempoEmpresa >= 12) {
            System.out.println("Participação na PLR: SIM");
        } else {
            System.out.println("Participação na PLR: NÃO");
        }

        // Bolsa de estudos: salário de até R$ 6.000 e pelo menos 12 meses de empresa
        if (salario <= 6000 && tempoEmpresa >= 12) {
            System.out.println("Bolsa de estudos: SIM");
        } else {
            System.out.println("Bolsa de estudos: NÃO");
        }

        scanner.close();
    }
}