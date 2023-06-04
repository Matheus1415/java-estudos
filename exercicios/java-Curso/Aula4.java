package com.mycompany.cursojava;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        //import
        Scanner scan  =  new Scanner(System.in);
        //variavel
        int n1, n2, res;
        String nome;
        //processamento
        System.out.println("Digite seu nome");
        nome = scan.next();
        System.out.println("Digite um numero: ");
        n1=scan.nextInt();
        System.out.println("Digite mais um numero");
        n2 =  scan.nextInt();
        res = n1 + n2;
        System.out.printf("%s a soma de %d  mais %d é igual a : %d",nome,n1,n2,res);
        
    }//psvm
}//classe principal
