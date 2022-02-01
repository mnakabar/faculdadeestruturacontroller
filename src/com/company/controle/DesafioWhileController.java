package com.company.controle;

import java.util.Scanner;

public class DesafioWhileController {

    public static void main(String[] args) {
        //- usuario digita o valor da nota;
        //- armazenar o valor da nota em variavel chamada total,
        // sempre que lancar nova nota somar o total
        //- calcular total de notas validas
        //- final mostrar a media
        //- e sair do programa digitar -1

        Scanner teclado = new Scanner(System.in);

        double qtnota = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Digite a nota: ");
            nota = teclado.nextDouble();

            System.out.println("Para calcular a média digite -1!!");

            if (nota <= 10 && nota >= 0){
                total += nota;
                qtnota++;
            }else {
                System.out.println("Nota invalida");
            }
        }
        //calcular a media
        double media = total /qtnota;
        System.out.println("Sua média é: " + media);


        teclado.close();
    }
}
