package aula12;

import java.util.Scanner;
public class exer01 {

    public static void main(String[] args) {
        /*Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido e continue pedindo
        até que o usuário informe um valor válido.*/
        
        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;
        double nota;
        
        System.out.println("Entre com uma nota entre 0 e 10: ");
        nota = scan.nextDouble();
        
        while (nota<0 || nota>10){
            System.out.println("Opção inválida, tente novamente");
            System.out.println("Entre com uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
        }
        
        
        
        /*do {
            System.out.println("Entre com uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            if (nota>=0 && nota<=10){
                notaValida = true;
                System.out.println("Você digitou:" +nota);
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
            
        } while (!notaValida);*/
        
        scan.close();
    
    }
    
}
