package com.company.exercicio;

import java.util.Random;
import java.util.Scanner;

public class EstruturaControle6Exercicio {

    public static void main(String[] args) {
        //Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        //Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas
        // para adivinhar o número gerado. Ao final de cada tentativa, imprima
        // a quantidade de tentativas restantes, e imprima se o número inserido
        // é maior ou menor do que o número armazenado.

        Scanner teclado = new Scanner(System.in);

        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        do {

            System.out.println("Sorteando número entre 0 e 100....\n");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt();

            System.out.println("Começou o jogo! Sera que você consegue vencer?");
            tentativas = 0;

            do {
                tentativas++;
                System.out.println("Tentativas %d: " + tentativas);
                numero = teclado.nextInt();

                if (numero > numeroSorteado) {

                    System.out.println("\nO número sorteado e menor  que %d \n" + numero);

                } else if (numero < numeroSorteado) {

                    System.out.println("\nO número sorteado e maior  que %d \n" + numero);
                } else {
                    System.out.println("\nParabens voce acertou o numero em %d tentativas" + tentativas);
                }
            } while (numero != numeroSorteado);

            System.out.println("Digite 0 para sair, ou qualquer outro número para continuar jogando!!");
            continuar = teclado.nextInt();

        }while (continuar != 0);

            teclado.close();

        }

    }
