package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle8Exercicio {

    public static void main(String[] args) {
       //Criar um programa que receba uma palavra e imprime no console letra por letra.

    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma palavra:  ");
        String palavra = teclado.next();

        char letra [] =palavra.toCharArray();

        for (int i = 0; i < letra.length; i++) {
            System.out.println(letra[i]);
        }

    teclado.close();
    }
}
