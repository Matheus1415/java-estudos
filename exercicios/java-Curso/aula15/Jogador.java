package com.mycompany.cursojava.aula15;
public class Jogador {
    
    private final int num;    
    private final int vidas;
    
    public  Jogador(int n){
        this.num=5;
        this.vidas=10;
        System.out.printf("Jogador numero %d criado com sucesso%n",n);
    }//jogador
    
    public int getVidas(){
        return vidas;
    }//get vidas
    
    public void setVidas(){
        //this.vidas;
    }
    
}//jogador
