package estruturaRepticao;

import javax.swing.JOptionPane;

public class Enquanto4 {
    public static void main(String[] args) {
       //VARIAVEL
       int contador=0, numero, salto;
       
       //ENTRADA
       numero=Integer.parseInt(JOptionPane.showInputDialog
       ("digite ate quanto devo contar"));
       salto=Integer.parseInt(JOptionPane.showInputDialog
       ("digite de quantos saltos devo contar"));
       
       //LAÇO
       while(contador<=numero){
           System.out.println(contador);
           contador+=salto;
       }//fecha while
        System.out.println("terminei de conatar!");
    }//fecha metodo
}//fecha classe
