package org.example;

import java.util.Scanner;

public class exercicio2 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo que o funcionario esta: ");

        int mesdofuncionario = input.nextInt();

        if(mesdofuncionario > 3 ){
            System.out.println("voce tem direito ao plano de saude");
        }else {
            System.out.println("voce não tem direto ao plano de saude");
        }
    }
}
