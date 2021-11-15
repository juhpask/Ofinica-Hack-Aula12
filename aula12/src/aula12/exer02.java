package aula12;

import java.util.Scanner;
public class exer02 {
    
    public static void main (String[] args){
        /*Faça um programa que leia um nome de usuáro e sua senha e
        não aceite a senha igual ao nome de usuário, mostrando uma
        mensagem de erro e voltamos a pedir as informações*/
        
        Scanner scan = new Scanner(System.in);
        String userName;
        String userPassword;
        
        System.out.println("Entre com o nome de usuário");
        userName = scan.next();
        System.out.println("Entre com a senha do usuário");
        userPassword = scan.next();
        
        while (userPassword.equalsIgnoreCase(userName)){
            System.out.println("O nome e a senha não podem ser iguais, tente novamente!");
            
            System.out.println("Entre com o nome de usuário");
            userName = scan.next();
            System.out.println("Entre com a senha do usuário");
            userPassword = scan.next();
        }
        
        System.out.println("Informações de nome e senha cadastradas!");
        
        
        /*
        //Outra forma:
        boolean infoValida = false;
        
        do{
            System.out.println("Entre com o nome de usuário");
            userName = scan.next();
            System.out.println("Entre com a senha do usuário");
            userPassword = scan.next();
        
            if(userPassword.equalsIgnoreCase(userName)){
                System.out.println("O nome e a senha não podem ser iguais, tente novamente!");
            } else {
                infoValida = true;
            } 
        } while (!infoValida);
        */
        
    }

}
