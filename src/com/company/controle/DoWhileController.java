package com.company.controle;

import java.util.Scanner;

public class DoWhileController {

    public static void main(String[] args) {
        // if (expressao..) sentenca; ou {} define se ira ou nao executar
        // while(expressao retorna true ou false) sentenca; ou {} ira executar enquanto for true
        //for(inicia variavel..; .expressao..; modificacao variavel ...) sentenca; ou {}

        //do sentenca; ou {} while (expressao);OBS termina sempre com ponto e virgula ;

        Scanner teclado = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Por favor, digite as palavras magicas");
            System.out.println("voce desaja sair do programa");
            texto = teclado.next();
        }while (!texto.equalsIgnoreCase("favor"));

        System.out.println("Obrigado!!!");
        teclado.close();
    }
}
