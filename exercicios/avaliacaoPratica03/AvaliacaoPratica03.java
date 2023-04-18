package avaliacaoPratica03;
import java.util.Scanner;
public class AvaliacaoPratica03 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        //VARIAVEL
        int time;
        //ENTRADA
        System.out.println("Digite 1 para PALMEIRAS"+
                           "\n Digite 2 para CRUSEIRO"+
                           "\n Digite 3 para GRÊMIO"+
                           "\n Digite 4 para SANTOS"+
                           "\n Digite 5 para ATÉTICO"+
                           "\n Digite 6 para CORINTIAS"+
                           "\n Digite 7 para FLAMENGO "+
                           "\n Digite 8 para BOTAFOGO "+
                           "\n Digite 9 para ATLETICO "+
                           "\n Digite 10 para INTERNACIONAL");
        time=entrada.nextByte();
        //PROCESSAMENTO
        switch(time){
             case 1:
                System.out.println("PALMEIRAS SP");
            break;
            
            case 2:
                System.out.println("CRUSEIRO RS");
            break;
            
            case 3:
                System.out.println("GRÊMIO ES");
            break;
            
             case 4:
                System.out.println("SANTOS SP");
            break;
            
            case 5:
                System.out.println("ATÉTICO MG");
            break;
            
            case 6:
                System.out.println("CORINTIAS SP");
            break;
            
            case 7:
                System.out.println("FLAMENGO RJ");
            break;
            
            case 8:
                System.out.println("BOTAFOGO RJ");
            break;
            
            case 9:
                System.out.println("ATÉTICO PR");
            break;
            
            case 10:
                System.out.println("INTERNACIONAL rs");
            break;
            
        }//fecha swtch
        
        
    }//fecha metodo
}//fecha classe
