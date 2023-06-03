package estruturaDeSelecao;

import javax.swing.JOptionPane;

public class Multipla2 {
    public static void main(String[] args) {
        
        //VARIAVEL
        int  n1, n2, cod;
        float res;
        
        //ENTRADA
        n1=Integer.parseInt(JOptionPane.showInputDialog
        (null,"digite o primeiro numero"));
        
        n2=Integer.parseInt(JOptionPane.showInputDialog
        (null,"digite o primeiro numero"));
        
         cod=Integer.parseInt(JOptionPane.showInputDialog
        (null,"digite 1 para soma"
                +"\n digite 2 para subtração"
                +"\n digite 3 para divisão"
                +"\ndigite 4 para multiplicação"));
        switch(cod){
            
            case 1: res=n1+n2;
                    JOptionPane.showMessageDialog(null,"a soma:"+res);
            break;
            case 2: res=n1-n2;
                JOptionPane.showMessageDialog(null,"subtração:"+res);
            break;
            case 3: res=n1/n2;
                JOptionPane.showMessageDialog(null,"divisão:"+res);
            break;
            case 4: res=n1*n2;
                JOptionPane.showMessageDialog(null,"multiplicação:"+res);
            break;
            
            default: JOptionPane.showMessageDialog
            (null,"não encontrei o material");
        }//fecha switch

    }//fim do metodo
}//fim da classe 
