package estruturaDeSelecao;

import javax.swing.JOptionPane;

public class Composto1 {
    public static void main(String[] args) {
        
        //variavel
        
        float salario, bonus, salariof; 
        int tempo;
        
        //entrada
        
        salario= Float.parseFloat(JOptionPane.showInputDialog
        ("Digite seu salario"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite o tempo na Empresa"));
        
        
        if (tempo >= 5){
            bonus = salario * 0.2f;
            salariof = bonus + salario;
            
        }//fecha if
        
        else {
            bonus = salario * 0.1f;
      
        salariof = bonus + salario;
        
        }//fecha else
        
        //saida
        JOptionPane.showMessageDialog(null, "seu bonus é R$" + bonus );
        JOptionPane.showMessageDialog
        (null, "seu salario final é R$" + salariof);
        
    }//fecha metodo
    
}//fecha classe
