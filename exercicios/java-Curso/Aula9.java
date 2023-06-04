package com.mycompany.cursojava;
public class Aula9 {
    public static void main(String[] args) {
        //vriavel
        int max= 5;
        int nota = 0;
        String[] gabarito= {"A","B","A","C","D"};
        String[] res= {"A","D","A","A","D"};
        //Processamento
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
