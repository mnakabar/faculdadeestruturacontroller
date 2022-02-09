package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle5Exercicio {

    public static void main(String[] args) {
        //Exercio 04 Criar um programa que receba
        // um número e diga se ele é um número primo.

       //Refatorar o exercício 04, utilizando a estrutura switch.

       Scanner teclado = new Scanner(System.in).reset();

       int valor = 0;

        System.out.println("Informe um número para saber se é primo ou não: ");
        int numero = teclado.nextInt();

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                valor++;
            }
        }
         if (valor == 0){
             System.out.println("O número " + numero + " é primo!!");
         }else {

             System.out.println("O número " + numero + " não é primo!!");
         }

        teclado.close();
    }
}
