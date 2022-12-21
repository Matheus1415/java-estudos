package atividadas;

import javax.swing.JOptionPane;

public class ExercicioSelecao {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //variavel
        
        float p1, p2,nota;
        
        //entrada
        
        p1=Integer.parseInt(JOptionPane.showInputDialog
        ("digite a nota da parcial:"));
        p2=Integer.parseInt(JOptionPane.showInputDialog
        ("digite a nota global:"));
        
        //processamento e saida
        
        nota=(p1+p2)/2;
        
        if(nota!=1){
            if(nota <= 5){
                JOptionPane.showMessageDialog
                (null,("O aluno é 'D' "+"SUA NOTA:"+nota));
            }//aluno D
            
            else {
                if(nota >=6){
                    JOptionPane.showMessageDialog
                    (null,("O aluno é 'C'"+"SUA NOTA:"+nota));
                } //aluno C
                else{
                    if(nota>=7){
                     JOptionPane.showMessageDialog
                     (null,("O aluno é 'B'"+"SUA NOTA:"+nota));
                    }//aluno nota B
                    else{
                        if(nota>=9){
                            JOptionPane.showMessageDialog
                            (null,("O aluno é A"+"SUA NOTA"+nota));
                        }//aluno nota A
                    }//else dob
                }//else da nota C  
            } //aluno nota D          
        }//zerou a prova
        else{
            JOptionPane.showMessageDialog(null,"O aluno zerou a prova");
        }//saida 1
    }//fecha meu metodo
}//fecha classe
