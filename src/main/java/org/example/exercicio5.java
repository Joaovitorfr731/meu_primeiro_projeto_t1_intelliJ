package org.example;

import java.util.Scanner;

public class exercicio5 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu salario: ");

        float salario = input.nextFloat();

        System.out.print("digite quanto precisa emprestado: ");

        float emprestimo = input.nextFloat();
        float porcentagem = (emprestimo / salario) * 100f;

        if(porcentagem <= 30){
            System.out.println("seu emprestimo foi aprovado: " + porcentagem + "% do seu salario.");
        }else {
            System.out.println("seu emprestimo foi recusado" );
        }
    }
}

