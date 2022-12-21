package atividadas;

import javax.swing.JOptionPane;

public class Atividade2 {
    public static void main(String[] args) {
        
        //VARIAVEL
        
       int copias,valor, vfinal;
        
        //ENTRADA
         copias = Integer.parseInt(JOptionPane.showInputDialog
                      (null,"digite a quantidade de copia"));
        
        valor = Integer.parseInt(JOptionPane.showInputDialog
                      (null,"digite 1 se for estudande"+
                              "\n digite 2 se for professor"+
                              "\n digite 3 se for direção"+
                              "\n digite 4 se não for aluno"));
        
        //PROCESSAMENTO E SAIDA
        
        switch(valor){
            case 1: vfinal =copias*(10/100);
             
             JOptionPane.showMessageDialog(null,"a soma:"+vfinal);
            break;
            
            case 2: vfinal =copias*(7/100);
             
             JOptionPane.showMessageDialog(null,"a soma:"+vfinal);
            break;
            
            case 3: vfinal =copias*(00/100);
             
             JOptionPane.showMessageDialog(null,"a soma:"+vfinal);
            break;
            
            case 4: vfinal =copias*(20/100);
             
             JOptionPane.showMessageDialog(null,"a soma:"+vfinal);
            break;
            
        }//fecha switch
        
    }//fecha metodo   
}//fecha classe
