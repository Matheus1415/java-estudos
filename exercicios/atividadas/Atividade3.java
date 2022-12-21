
package atividadas;

import javax.swing.JOptionPane;

public class Atividade3 {
    public static void main(String[] args) {
        
        //variavel
        float altura, imc;
        int entrada;
        
        //ENTRADA
        
        altura=Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite sua altura"));
        
        entrada=JOptionPane.showConfirmDialog(null,
        "Digite 1 se for homem"+"\n digite 2 se for mulher");
         
        //PROCESSAMENTO E SAIDA
        switch(entrada){
            
            case 1: imc=(float) ((72.7*altura)-58);
                    JOptionPane.showMessageDialog(null,"a soma:"+imc);
            break;
            case 2: imc= (float)((61.1*altura)-44.);
                JOptionPane.showMessageDialog(null,"subtração:"+imc);
            break;
        }//fecha switch
        
    }//fexha meu metodo
}//fecha classe
