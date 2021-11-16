package aula12;

import java.util.Scanner;
public class exer06 {

    public static void main (String[] args){
        /*Faça um programa que receba dois números inteiros e gere os
        números inteiros que estão no intervalo compreendido por eles.*/
        
        Scanner scan = new Scanner(System.in);
        int a,b;
        boolean countOK = false;
       
        do {
            System.out.println("Informe o primeiro número: ");
            a = scan.nextInt();
            System.out.println("Informe o segundo número (maior que o primeiro): ");
            b = scan.nextInt();
            if(a<b){
                System.out.println("Segue a sequência entre os números indicados: ");
                while (a<=b){
                    System.out.println(a);
                    a++;
                }
                countOK = true;
            } else {
                System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente!");
            }
        } while(!countOK);
            
        scan.close();
    }
}
