package com.mycompany.cursojava;
import java.util.Scanner;
public class Aula5 {
    public static void main(String[] args) {
        //import
        Scanner scan = new Scanner(System.in);
        //variavel
        int n1;
        int n2;
        int res;
        int ent;     
        
        System.out.println("Escolha o primeiro numero");
        n1 = scan.nextInt();
        System.out.println("Escolha mais um numero");
        n2 = scan.nextInt();
        
        System.out.println("Escolha uma operação\n 1 para soma\n 2 para menos \n 3 pra divisão \n 4 para multiplicação");
        ent = scan.nextInt();
        
        
        switch(ent){
            case 1 :
                res = n1+n2;
                System.out.printf("O resultado é %d",res);
            break; 
            
            case 2 :
                res = n1-n2;
                System.out.printf("O resultado é %d",res);
            break;
            
            case 3 :
                res = n1 / n2;
                 System.out.printf("O resultado é %d",res);
            break;
            
            default:
                res = n1*n2;
                System.out.printf("O resultado é %d",res);
            break;
                
        }
        
        //processamento
        
        
    }//psvm
}//classe principal
