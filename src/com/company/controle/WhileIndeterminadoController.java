package com.company.controle;

import java.util.Scanner;

public class WhileIndeterminadoController {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

         String texto = "";

         while (!texto.equalsIgnoreCase("Fim")){
             System.out.println("O que deseja:  " +
                     "\nPara finalizar o programa digite Fim");
             texto = teclado.next();
         }

         teclado.close();
    }


}

