package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle4Exercicio {

    public static void main(String[] args) {
        //Criar um programa que receba
        // um número e diga se ele é um número primo.

        Scanner teclado = new Scanner(System.in);

        int divisorNumerico = 0;

        System.out.println("Informe um número para saber se e primo ou não: ");
        int valor = teclado.nextInt();

        for (int i = 2; i < valor; i++){
            if (valor % i == 0){
                divisorNumerico++;
            }
        }

        if (divisorNumerico == 0){
            System.out.println("O número " + valor + " é primo!!");
        }else {
            System.out.println("O número " + valor + " não é primo!");
        }

         teclado.close();

    }

}
