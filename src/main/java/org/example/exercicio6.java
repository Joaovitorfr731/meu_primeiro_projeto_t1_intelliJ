package org.example;

import java.util.Scanner;

public class exercicio6 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor investido: ");

        float valorinvestido = input.nextFloat();

        if(valorinvestido <= 10000){
            System.out.println("Classificação:Bronze ");
        }else {
            System.out.println("seu emprestimo foi recusado" );
        }
    }
}
