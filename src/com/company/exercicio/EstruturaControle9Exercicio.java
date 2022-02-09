package com.company.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaControle9Exercicio {

    public static void main(String[] args) {

        //Crie um programa que recebe 10 valores
        // e ao final imprima o maior número.


        Scanner teclado = new Scanner(System.in);

        int maiorValor = 0;
        int contador = 0;

        do {
            System.out.println("Digite um número:  ");
            int valor = teclado.nextInt();

            if (valor > maiorValor){
                maiorValor = valor;
            }
            contador++;
        }while (contador != 10);

        System.out.println("O maior valor é ".toUpperCase() + maiorValor);

        teclado.close();


    }
}
