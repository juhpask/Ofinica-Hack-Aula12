package aula12;

import java.util.Scanner;
public class exer04 {
   
    public static void main (String[] args){
        //Faça um programa que leia 5 números e informe o maior número.
        
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e;
        int max1, max2, max3, max4;
        
        System.out.println("Informe um número: ");
        a = scan.nextInt();
        System.out.println("Informe outro número: ");
        b = scan.nextInt();
        System.out.println("Informe outro número: ");
        c = scan.nextInt();
        System.out.println("Informe outro número: ");
        d = scan.nextInt();
        System.out.println("Informe outro número: ");
        e = scan.nextInt();
        
        max1 = Math.max(a,b);
        max2 = Math.max(c,d);
        max3 = Math.max(e, max1);
        max4 = Math.max(max2, max3);
        
        System.out.println("Entre os números: "+a+", "+b+", "+c+", "+d+" e "+e);
        System.out.println("O maior número é: " +max4);
        
        
        scan.close();
    }
}
