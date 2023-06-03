package exercicio2;
import java.security.SecureRandom;
public class Exercicio4 {
    public static void impDados(int[][] mtz,int linha,int coluna){
         for(int l=0;l<linha;l++){ 
            for(int c=0;c<coluna;c++){
                System.out.printf("%d -",
                mtz[l][c]=new SecureRandom().nextInt(100));

            }//FOR COLUNA   
        System.out.printf("%n");
        }//FOR LINHA
    }//fecha metodo
}//fecha classe
