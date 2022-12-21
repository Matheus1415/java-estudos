package estruturaDeSelecao;

import javax.swing.JOptionPane;

public class Multipla {
    public static void main(String[] args) {
        
        //variavel
        int codigo;
        
        //entrada
        codigo=Integer.parseInt(JOptionPane.showInputDialog
        (null,"digite o material escolar:"));
        
        //processamento e saida
        switch(codigo){
            
            case 1:JOptionPane.showMessageDialog(null,"CADERNO");
            break;
            case 2:JOptionPane.showMessageDialog(null,"LAPIS");
            break;
            case 3:JOptionPane.showMessageDialog(null,"BORRACHA");
            break;
            
            default: JOptionPane.showMessageDialog
            (null,"não encontrei o material");
        }//fecha switch
    }//fecha o metodo
}//fecha classe
