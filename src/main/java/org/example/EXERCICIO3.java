package org.example;

import java.util.Scanner;

public class EXERCICIO3 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("você trabalha com seu carro (S/N): ");

        String resposta = input.nextLine();

        if(resposta.equalsIgnoreCase("S")){
            System.out.println("Ele pode ganhar benefico pro combustivel");
        }else {
            System.out.println("voce não tem direto ao beneficio combustivel");
        }
    }
}

