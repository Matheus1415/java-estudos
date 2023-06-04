package com.mycompany.cursojava;
import java.util.Scanner;
public class Aula7 {
    public static void main(String[] args) {
        //inport
        Scanner scan = new Scanner(System.in);
        //variavel
        int pular=0;
        int qpulo;
        //processamento
        System.out.println("Quantas vezes voce que pular? ");
        qpulo = scan.nextInt();
        
        while(pular < qpulo){
            System.out.printf("%d Pulando!\n",pular);
            pular++;
        }
        
    }//psvm
}//calsse principal
