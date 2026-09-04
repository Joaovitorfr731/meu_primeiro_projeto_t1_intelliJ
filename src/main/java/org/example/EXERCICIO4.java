package org.example;

import java.util.Scanner;

public class EXERCICIO4 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu cargo: ");

        String cargo = input.nextLine();

        if(cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("liderança")){
            System.out.println("voce pode ganhar benefico pro curso de outras linguas");
        }else {
            System.out.println("voce não tem direto ao beneficio do curso de outras linguas");
        }
    }
}

