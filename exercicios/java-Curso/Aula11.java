package com.mycompany.cursojava;
import java.security.SecureRandom;
public class Aula11 {
    public static void main(String[] args) {
        //variavel
        final int col=5;
        final int lin = 3;
        int[][] num = new int[lin][col];
        //processamento
        for(int l =0;l<lin;l++){
            for(int c =0;c<col;c++){
                num[l][c] = new SecureRandom().nextInt(100);
            }
        }
        
        for(int l =0;l<lin;l++){
            for(int c =0;c<col;c++){
                System.out.printf("%d |",num[l][c]);
            }
            System.out.printf("%n");
        }
        
    }//psvm
}//classe principal
