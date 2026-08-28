package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        System.out.println("\n2 - Operadores Lógicos Básicos");

        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 && cond3: " + (cond1 && cond3));

        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("cond2 || cond3: " + (cond2 || cond3));

    }
}
