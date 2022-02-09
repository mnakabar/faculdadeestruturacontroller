package com.company.exercicio;

import java.util.Scanner;

public class EstruturaControle2Exercicio {
    public static void main(String[] args) {

        //Criar um programa informa se o ano atual é um ano bissexto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantos dias o ano possui: ");
    // System.out.println("Informe o ano: ");
        int ano  = teclado.nextInt();

    // int bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);

        if (ano == 366){
            System.out.println("O ano é bissexto!");
        }else if (ano == 365){
            System.out.println("O ano não é bisseto.");
        }else {
            System.out.println("Opção errada.");
        }
        System.out.println("Fim!!!");
    }
}
