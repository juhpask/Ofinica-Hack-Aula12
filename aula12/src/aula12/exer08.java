package aula12;

import java.util.Scanner;
public class exer08 {

    public static void main (String[] args){
        /*Faça um programa que peça 10 números inteiros, calcule e mostre
        a quantidade de números pares e a quantidade de números ímpares.*/
        
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int num;
        int par = 0;
        int impar = 0;
        
        while (i <=10) {
            System.out.println("Informe um número: ");
            num = scan.nextInt();
            if (num%2 == 0){
                par++;
            } else {
                impar++;
            }
            System.out.println("A quantidade atual de números pares é: " +par);
            System.out.println("A quantidade atual de números impares é: " + impar);
            i++;
        }
        
        System.out.println("Thanks for playing!");
    
        scan.close();
    }
}
