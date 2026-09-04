package org.example;

import java.util.Scanner;

public class exercicio1 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salario: ");

        float salsarioFuncionario = input.nextFloat();

        if(salsarioFuncionario <= 4000 ){
            System.out.println("voce tem direito ao vale refeição!");
        }else {
            System.out.println("voce não tem direto ao vale refeição");
        }
    }
}
