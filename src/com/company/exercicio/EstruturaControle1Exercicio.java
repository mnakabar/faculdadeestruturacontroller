package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle1Exercicio {
    public static void main(String[] args) {
        //Criar um programa que receba um número
        // e verifique se ele está entre 0 e 10 e é par;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();


        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " está entre 0 e 10 e é " +
                        "um número PAR parabéns!!!");
            } else {
                System.out.println("O número " + numero + " está entre 0 e 10, más " +
                        "não é um número PAR");
            }
        } else {
            System.out.println("O número " + numero + " não está entre 0 e 10!!!");

            System.out.println("\nFim....");
        }
        teclado.close();
    }
}
