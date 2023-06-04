package com.mycompany.cursojava.aula15;
public class Pincipal {
    public static void main(String[] args) {
            
            //variavel
            int num=0;
            Jogador j1 = new Jogador(num++);
            Jogador j2 = new Jogador(num++);
            
            
            System.out.printf("Vidas do jogador 1:%d",j1.getVidas());
    }
}
