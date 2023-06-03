package estruturaSequecial;
import java.util.Scanner;
public class Codego2 {
    public static void main(String[] args) {
       //variaveis
       int n1,n2, subtracao,multiplicacao ;
       float divisao;
       
       //entrada
       
       Scanner entrada;
       entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        n1= entrada.nextInt();
        System.out.println("digite o primeiro numero");
        
        
        
        
        n2= entrada.nextInt();
                                                                                                                                             
          //processamento

        subtracao= n1 -n2;
        multiplicacao= n1 * n2;
        divisao = (float) n1 / n2;
        
       //saida
       
        System.out.println("resultado"+ subtracao);
        System.out.println("resultado"+ multiplicacao);
        System.out.println("resultado"+ divisao);

    }//fim do meu metodo
}//fim da classe
