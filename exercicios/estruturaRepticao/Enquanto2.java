package estruturaRepticao;

import javax.swing.JOptionPane;

public class Enquanto2 {
    public static void main(String[] args) {
        
        //variavel
        int contador=0;
        
        //LAÇO
        
        while(contador<=10){
            System.out.println("contador"+contador);
            contador=contador+1;
        }//fecha while
            JOptionPane.showMessageDialog(null,"terminei de contar!"+contador);
    }//fecha metodo
}//fecha classe
