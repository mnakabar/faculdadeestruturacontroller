package com.company.controle;

import java.util.Scanner;

public class SwitchComBreakController {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
//
//        String conceito = "";
//        System.out.println("Informe a nota:");
//        int nota = teclado.nextInt();
//
//        switch (nota){
//            case 10 :
//                conceito = "A" + "\nParabéns!!!";
//                break;
//            case 9 :
//                conceito = "A-";
//                break;
//            case 8 :
//                conceito = "B";
//                break;
//            case 7 :
//                conceito = "B-";
//                break;
//            case 6 :
//                conceito = "C";
//                break;
//            case 5 :
//                conceito = "C-";
//                break;
//            case 4 :
//                conceito = "D";
//                break;
//            case 3 :
//                conceito = "D-";
//                break;
//            case 2 :
//                conceito = "E";
//                break;
//            case 1 :
//                conceito = "E-";
//                break;
//            case 0 :
//                conceito = "E--" + "\nPrecisa melhorar!";
//                break;
//        }


        String conceito = "";
        System.out.println("Digite a nota: ");
        int valor = teclado.nextInt();

        switch (valor){
            case 10 : case 9 :
                conceito = "A" + "\nParabéns!!!";
                break;
            case 8 : case 7 :
                conceito = "B";
                break;
            case 6 : case 5 :
                conceito = "C";
                break;
            case 4 : case 3 :
                conceito = "D";
                break;
            case 2 : case 1 : case 0 :
                conceito = "E" + "\nPrecisa melhorar!";
                break;
            default:
                conceito = "Nota não é valida.";

        }

        System.out.println("Conceito é: " + conceito);
        System.out.println("\nFim do programa!!!!!");

        teclado.close();

    }
}
