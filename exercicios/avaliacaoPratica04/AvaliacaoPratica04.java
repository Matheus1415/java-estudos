package avaliacaoPratica04;
import java.util.Scanner;
public class AvaliacaoPratica04 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        //VARIAVEL
        float nota;
        //ENTRADA
        
        System.out.println("Digite sua nota");
        nota=entrada.nextByte();
        
        //PROCESSAMENTO
        
        if(nota < 6){
            System.out.println("Aluno nota F");
        }else if((nota < 7)&&(nota >= 6)){
            System.out.println("Aluno nota D");
        }else if((nota >= 7.1)&&(nota <8)){
            System.out.println("Aluno nota C");
        }else if((nota >= 8.1)&&(nota <9)){
            System.out.println("Aluno nota B");
        }else if((nota >= 9.1)&&(nota <= 10)){
            System.out.println("Aluno nota A");
        }
    }//fecha metodo
}//fecha classe
