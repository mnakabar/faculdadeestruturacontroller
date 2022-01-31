package com.company.controle;

import java.util.Scanner;

public class IfController {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a média do aluno: ");
        double media = teclado.nextDouble();

        boolean criterioDeAvaliacao = media >= 7.0 && media<=10;
//        if (criterioDeAvaliacao) {
//            System.out.println("Aprovado!");
//            System.out.println("Parabéns!");
//        }
//        if (media <= 5 && media>= 3.5){
//            System.out.println("recuperacao");
//        }
//        if (media >= 0 && media <3.4 ){
//            System.out.println("reprovado");
//        }

        double nota = 1.3;
        if (nota >= 9.0)
        {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }



        teclado.close();

    }
}
