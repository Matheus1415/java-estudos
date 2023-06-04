package com.mycompany.cursojava;
public class Aula14 {
    public static void main(String[] args) {
        System.out.println(soma(20,40,10,5));
    }//psvm
    public static int soma(int...num){
        int res=0;
        for(int n:num){
            res+=n;
        }
        return res;
    }//soma
}//classe principal
