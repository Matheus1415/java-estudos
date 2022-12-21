package estruturaDeSelecao;
import javax.swing.JOptionPane;

public class Encadeada1 {
    public static void main(String[] args) {
        
        //variavel
        int A, B, C;
        
        //entrada
        
        A=Integer.parseInt(JOptionPane.showInputDialog
        ("digite o primeiro lado :"));
        B=Integer.parseInt(JOptionPane.showInputDialog
        ("digite o segundo lado :"));
        C=Integer.parseInt(JOptionPane.showInputDialog
        ("digite o terçeiro lado :"));

        //processamento
        
        if(A !=0 && B !=0 && C !=0){
        
            if(A <= B+C && B<= A+C && C <=A+B ){
                System.out.println("É UM TRIANGULO");
                if(A == B && B==C){
                   JOptionPane.showMessageDialog
                   (null,"É UM TRIANGULO EQUILATERO");                   
                    }//IF DO EQUILATERO
                else{
                     if(A != B && A != C && B != C){
                     JOptionPane.showMessageDialog
                     (null,"É UM TRIANGULO ESCALENO");
                     }//IF ESCALENO
                     else{
                        JOptionPane.showMessageDialog
                        (null,"DORMA UM TRIANGULO ISOSCELE");
                        }//isoscele
                   }//ELSE DO EQUILATERO
            }//SEGUNDO IF          
            else{
                JOptionPane.showMessageDialog
                (null,"NÃO PODE AVER UM LADO MAIRO QUE A SOMA DOS OUTROS");
            }//segundo els       
        }//primeiro if
        
        else {
            JOptionPane.showMessageDialog
        (null,"NÃO PODE AVER UM LADO MAIRO QUE A SOMA DOS OUTRO");
        }//fecha primeiro else
    }//Fecha psvm
}//fecha classe
 