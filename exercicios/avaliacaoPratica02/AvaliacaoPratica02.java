package avaliacaoPratica02;
import java.util.Scanner;
public class AvaliacaoPratica02 {
    public static void main(String[] args) {
        //VARIAVEL
        int sexo;
        Scanner entrada;
        entrada= new Scanner(System.in);
        //ENTRADA
        System.out.println("Digite '1' para feminino, '2' para masculino e '3' para outro genero" );
        sexo=entrada.nextByte();
        //PROCESSAMENTO
        switch(sexo){
            case 1:
                System.out.println("Você é do sexo Feminino");
            break;
            
            case 2:
                System.out.println("Você é do sexo Maculino");
            break;
            
            case 3:
                System.out.println("Você é de outo genero");
            break;
            
        }//fecha switch
    }//fecha metodo
}//fecha classe
