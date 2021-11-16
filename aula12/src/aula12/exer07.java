package aula12;

import java.util.Scanner;
public class exer07 {

    public static void main (String[] args){
        //Faça um programa que receba um número inteiro entre 1 e 10 e gere sua tabuada.
        
        Scanner scan = new Scanner(System.in);
        int a;
        int i = 0;
        
        System.out.println("Informe um número de 1 a 10 para ver sua tabuada: ");
        a = scan.nextInt();
        
        while(i<=10){
            System.out.println("Tabuada do: " + a);
            System.out.println(i + " x " + a + " = " + a*i);
            i++;
        }
        
        scan.close();
    }
}
