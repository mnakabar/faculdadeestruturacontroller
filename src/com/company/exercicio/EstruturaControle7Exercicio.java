package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle7Exercicio {

    // Criar um programa que enquanto estiver recebendo números positivos,
    // imprime no console a soma dos números inseridos, caso receba um número negativo,
    // encerre o programa. Tente utilizar a estrutura do while.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int somaDeNumero = 0;
        int numero = 0;

        while (numero >= 0){
            System.out.println("\nDigite um número para calculo ou número negativo para finalizar" +
                    "\n===============================================================");
            numero = teclado.nextInt();

            if (numero >= 0){
                somaDeNumero += numero;
                System.out.println("A soma do número é:  " + somaDeNumero);
            }else if (numero < 0){
                System.out.println("Fim!!!");
            }
        }

        teclado.close();
    }
}
