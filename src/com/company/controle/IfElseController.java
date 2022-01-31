package com.company.controle;

import java.util.Scanner;

public class IfElseController {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número");
        double num = teclado.nextDouble();

        if (num % 2 == 0){
            System.out.println("numero par!!!");
        }else {
            System.out.println("numero impar");
        }


    }
}
