package estruturaSequecial;
import java.util.Scanner;
public class Codego4 {
    public static void main(String[] args) {
        //variavel
        
        float cons, dis, consumo; //conbustivel e distancia
        
        //entrada
        Scanner entrada;
        entrada= new Scanner(System.in);
        System.out.println("escreva aqui o conbustivel");
        cons=entrada.nextInt();
        System.out.println("digite a distancia");
        dis=entrada.nextInt();
        //processamento
        consumo= (float) cons / dis;
        //saida
        System.out.println("seu consumo é :" +consumo);
       
        
    }//fim do meu metodo
}//fim da classe
