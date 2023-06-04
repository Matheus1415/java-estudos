package com.mycompany.cursojava;
import java.util.Scanner;
public class Aula10 {
        public static void main(String[] args) {
        //import
        Scanner scan = new Scanner(System.in);
        
        //vriavel
        int max= 5;
        int nota = 0;
        String[] gabarito= {"A","B","A","C","D"};
        String[] res = null;
        //Processamento
        for(int a=0;a<max;a++){
            System.out.printf("Infome a respota de %d",a);
            //res[a] = scan.nextLine().charAt(0);
        }
        
        for(int i = 0;i< max;i++){
                      
           if(res[i] == gabarito[i]){
               nota++;
            } //fim do if
            //fim do if
        }//fim do for
        //Saida
        System.out.printf("A nota do aluno foi: %d",nota);
    }//psvm
}//classe principal
