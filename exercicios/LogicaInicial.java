import java.util.Scanner;

import javax.swing.JOptionPane;

public class LogicaInicial {
    public static void main(String[] args) {

      //entradac e saida de dados usando ScannerEcra
      Scanner entradaEcra;

      entradaEcrã=new Scanner(System.in);

      System.out.println("Digite seu nome");
      String nome = entradaEcra.next();
      System.out.println();

      System.out.println("seu nome é"+nome+"\n");

      //usando JOptionPane(janela)

      final String sobrenome=JOptionPane.showInputDialog(null,sobrenome);

      JOptionPane.showMessageDialog(null,"seu nome completo é"+nome""+sobrenome);

      

    }//conteudo
}//final da classe
