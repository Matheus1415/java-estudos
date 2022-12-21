package estruturaDeSelecao;

import javax.swing.JOptionPane;

public class Simples1 {
    public static void main(String[] args) {
      //VARIAVEL
      int numero;
      
      //ENTRADA
      numero= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
      
      //PROCESSAMENTO
      if(numero % 2 == 1){
      JOptionPane.showMessageDialog(null,"O Numero"+ numero +" é impar!!!" );
      
      }//FECHA IF
        JOptionPane.showMessageDialog(null,"FIM DO PROGRAMA");
    }//fechamento do metodo
}//fechamento da classe
