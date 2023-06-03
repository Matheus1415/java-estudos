package AvaliacaoPratica01;
import java.util.Scanner;
public class AvaliacaoPratica01 {
    public static void main(String[] args) {
        //VARIAVEL
        int idade;
        Scanner entrada;
        //ENTRADA
        entrada= new Scanner(System.in);
        System.out.println("digite sua idade");
        idade=entrada.nextByte();
        //PROCESSAMENTO
        if(idade >= 18){
            System.out.println("já pode dirigir");
        }else{
            System.out.println("ainda não pode dirigir");
        }//fim da comdição
    }//fecha metodo
}//fecha classe
