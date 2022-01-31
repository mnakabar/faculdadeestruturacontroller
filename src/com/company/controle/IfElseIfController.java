package com.company.controle;

import java.util.Scanner;

public class IfElseIfController {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota do aluno!!");

        double nota = teclado.nextDouble();
        

        if (nota > 10.0 || nota < 0.0) {
            System.out.println("Nota invalida");
        } else if (nota >= 9.0 && nota <= 10.0){
            System.out.println("Conceito A");
        } else if (nota >= 7.0 && nota <= 8.9){
            System.out.println("Conceito B");
        } else if (nota >= 5.0 && nota <=6.9){
            System.out.println("Conceito C");
        }else if (nota >= 3.0 && nota <= 4.9){
            System.out.println("Conceito D");
        }else if (nota >= 0 && nota <=2.9){
            System.out.println("Conceito E");
        }




            teclado.close();


    }
}
