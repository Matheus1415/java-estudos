
import java.util.Scanner; 
public class Codegoo1 {
    public static void main(String[] args) {
      //variaveis
      int n1, n2, resultado; //variavel inteira
      
      //entrada
      Scanner entrada;
      entrada= new Scanner(System.in);
       System.out.println("digite o primeiro numero");
        n1=entrada.nextByte();
        System.out.println("digite o segundo numero");
        n2=entrada.nextByte();
        
        //processamento
        resultado = n1 + n2;
        
        //saida
        System.out.println("o resultado da soma é:"+resultado);
        
    }//fim do metodo
                                    
}//fim da classe