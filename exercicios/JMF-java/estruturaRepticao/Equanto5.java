package estruturaRepticao;

import javax.swing.JOptionPane;

public class Equanto5 {
    public static void main(String[] args) {
        //VARIAVEL
        int soma=0, cont=0, maior=0, numero;
        
        //ENTRADA E PROCESSAMENTO
        while(cont<=5){
            numero=Integer.parseInt
            (JOptionPane.showInputDialog("Digite"+cont+"valor:"));
            
            if(numero>maior){
            maior=numero;
            }//fecha if
            soma+=numero;
            cont+=1;
        }//fecha while
        
        //SAIDA
        JOptionPane.showMessageDialog
        (null,"A soma dos valores foi"+soma+"E o maior valor foi"+maior);
    }//fecha metodo
}//fecha clasxe
