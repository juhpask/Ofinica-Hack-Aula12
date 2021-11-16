package aula12;

import java.util.Scanner;
public class exer03 {
    
    public static void main (String[] args){
        /*Faça um programa que leia e valide as seguintes informações:
        a. Nome: maior que 3 caracteres;
        b. Idade: entre 0 e 150;
        c. Salário: maior que zero;
        d. Sexo: 'f' ou 'm';
        e. Estado Civil: 's', 'c', 'v', 'd';*/
        
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double sal;
        String gender;
        String civil;
        
        //name
        boolean nameOK = false;
        do{
            System.out.println("Informe o seu nome: ");
            name = scan.next();
            if (name.length()>=3 && name.matches("[A-Z]*")){
                System.out.println("Prazer, " + name+ "!");
                nameOK = true;
            } else {
                System.out.println("Nome inválido. Seu nome deve possuir pelo menos 3 letras e nenhum número.");
            }
        } while(!nameOK);
        
        //age
        boolean ageOK = false;
        do{
            System.out.println("Informe a sua idade: ");
            age = scan.nextInt();
            if(age>=0 && age <=150){
                System.out.println("Sua idade é: " + age);
                ageOK = true;
            } else {
                System.out.println("Idade inválida, tente novamente!");
            }
        } while (!ageOK);
        
        
        //salário
        System.out.println("Informe o seu salário: ");
        sal = scan.nextDouble();
        while (sal<0){
            System.out.println("Valor inválido, tente novamente!");
            System.out.println("Informe o seu salário: ");
            sal = scan.nextDouble();
        }
        
       
        //gênero
        
        boolean genderOK = false;
        do{
            System.out.println("Informe o seu gênero: ");
            System.out.println("('F' para feminino, 'M' para masculido e 'NB' para não binário)");
            gender = scan.next();
            if (gender.equalsIgnoreCase("f")){
                System.out.println("Você se considera do gênero: Feminino");
                genderOK = true;
            } else if (gender.equalsIgnoreCase("m")){
                System.out.println("Você se considera do gênero: Masculino");
                genderOK = true;
            } else if (gender.equalsIgnoreCase("nb")){
                System.out.println("Você se considera: Não binário");
                genderOK = true;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while (!genderOK);
        
        //civil
        boolean civilOK = false;
        do{
            System.out.println("Informe o seu estado civil");
            System.out.println("('S' para solteiro, 'C' para casado, 'V' para viúvo e 'D' para Divorciado)");
            civil = scan.next();
            if (civil.equalsIgnoreCase("s")){
                System.out.println("Seu estado civil é: Solteiro");
                civilOK = true;
            } else if (civil.equalsIgnoreCase("c")){
                System.out.println("Seu estado civil é: Casado");
                civilOK = true;
            } else if (civil.equalsIgnoreCase("v")){
                System.out.println("Seu estado civil é: Viúvo");
                civilOK = true;
            } else if (civil.equalsIgnoreCase("d")){
                System.out.println("Seu estado civil é: Divorciado");
                civilOK = true;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while (!civilOK);
        
        scan.close();
    }
}
