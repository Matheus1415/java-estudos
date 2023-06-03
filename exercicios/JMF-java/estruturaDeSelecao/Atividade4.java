package atividadas;

import javax.swing.JOptionPane;

public class Atividade4 {
    public static void main(String[] args) {
        
        //VARIAVEL
        float salarioBase, gratificacao;
        float salariob=0, ir=0;
        float salariol;
        
        //ENTRADA
        salarioBase= Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario"));
        gratificacao= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de gratificação"));
  
        //PROCESSAENTO
        if(salariob <=1000){
            ir= (float)salariob *0.2f;
        }//fecha if
        else{
            ir= (float)salariob *(15/100);
       }//fecha else
       salariol= (float)salariob -ir;
       
       //FECHA ELSE
        JOptionPane.showMessageDialog(null,
         "###############################"
        +"\n\nSALARIO BASE:      r$"+salarioBase
        +"\n\nGRATIFICAÇÃO:      r$"+gratificacao
        +"\n\nsalario bruto:     r$"+salariob
        +"\n\nIMPOSTO DE RENDA:  r$"+ir
        +"\n\nSALARIO LIQUIDO:   r$"+salariol
        +"\n\n##########################");
    }//fecha metodo
}//fecha classe
