package com.company.controle;

import java.util.Locale;

public class SwitchSemBreakController {

    public static void main(String[] args) {

        String faixa = "branca";

        switch (faixa.toLowerCase(Locale.ROOT)){
            case "preta" :
                System.out.println("Bassai-Dai");
            case "marron" :
                System.out.println("Tekki Shodan");
            case "roxa" :
                System.out.println("Heian Godan");
            case "verde" :
                System.out.println("Heian Yodan");
            case "laranja" :
                System.out.println("Heian Sadan");
            case "vermelha" :
                System.out.println("Heian Nidan");
            case "amarela" :
                System.out.println("Heidan Shodan");
//                break;
            default:
                System.out.println("Iniciante faixa branca");
        }
        System.out.println("Fim!! \n");


        int idade = 3;

        switch (idade){
            case 3 :
                System.out.println("Sabe falar!");
            case 2 :
                System.out.println("Sabe andar!");
            case 1 :
                System.out.println("Sabe engatinhar!");
        }
    }
}
