package exercicio2;

import java.security.SecureRandom;

public class Exercico3 {
    public static void main(String[] args) {
        //VARIAVEL
        final int linha =3;
        final int coluna =5;
        //PROCESSAMENTO
        int[][] numero= new int [linha][coluna];
        
            for(int l=0;l<linha;l++){ 
                for(int c=0;c<coluna;c++){
                    System.out.printf("%d -",
                    numero[l][c]=new SecureRandom().nextInt(100));

                }//FRO COLUNA   
                System.out.printf("%n");
            }//FOR LINHA
           
    }//fim do metodo
    
    
}//fim da classe
