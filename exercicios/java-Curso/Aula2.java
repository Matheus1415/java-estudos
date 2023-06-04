package com.mycompany.cursojava;
public class Aula2 {
    public static void main(String[] args) {
        // == < > <= >= != !
        //variavel
        int nota = 85;
        int media = 60;
        int falta= 10;
        int maxfalta= 5; 
        //processamento
         if(nota >= media && falta <= maxfalta){
             System.out.println("Aluno aprovado");
        }else if(nota <= 40){
             System.out.println("Aluno de recuperação");
        }else{
             System.out.println("Aluno reprovado");
        }
        /*
         Tabela verdade AND &&
         V V = V
         V F = F
         F V = F
         F F = F
        */
        
        /*
        Tabela verdade OR ||
        V V = V
        F V = V
        V F = V
        F F = F
        */
        
        //Maneira 2
        
        //variavel
        int nota2 = 40;
        int media2 = 60;
        String res;
        //processamento 2
        res = (nota2 <= media2 ? "Aprovado" : "Reprovado");
        //saida
        System.out.println("O resultado é "+ res);
        
        
    }//psvm
}//classe principal
