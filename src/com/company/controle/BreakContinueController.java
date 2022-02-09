package com.company.controle;

public class BreakContinueController {

    public static void main(String[] args) {
       for (int i = 10; i >= 0; i --){
           if (i == 5){
               break;
           }
           System.out.println(i);
       }

        System.out.println("\n====\n");

        for (int i = 0; i <=10; i += 2 ){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n====\n");

        for (int i = 10; i>=0; i--){
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\nFim!!!");

    }
}
