package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle3Exercicio {
    public static void main(String[] args) {

        // Criar um programa que receba duas notas parciais,
        // calcular a média final.
        // Se a nota do aluno for maior ou igual a 7.0
        // imprime no console "Aprovado",
        // se a nota for menor que 7.0 e maior do que 4.0 imprime no console
        // "Recuperação", caso contrário imprime no console "Reprovado".

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 10 || media < 0) {
            System.out.println("Notas invalidas");
        } else if (media >= 7) {
            System.out.println("Sua média foi " + media + " e você está aprovado." + "\nParabéns!!!");
        } else if (media >= 4) {
            System.out.println("Sua média foi " + media + " e você está de recuperação!");
        } else {
            System.out.println("Sua média foi " + media + " e você está reprovado!");
        }



        System.out.println("\nFim do programa...");
        teclado.close();
    }
}
