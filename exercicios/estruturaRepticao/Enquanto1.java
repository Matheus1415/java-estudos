package estruturaRepticao;

import javax.swing.JOptionPane;

public class Enquanto1 {
    public static void main(String[] args) {
        
        //variavel
        float numero =0,media = 0, soma = 0;
        int cont=0; 
        
        //ENTRADA
        
        while(cont <5){
            numero= Integer.parseInt(JOptionPane.showInputDialog
        ("digite o numero"));
            
            //laço
            
            soma=soma + numero;
            cont=cont+1;
        }//FECHA WHILE
        
        //processamento
        
        media=soma/cont;
           
        //SAIDA
        JOptionPane.showMessageDialog(null,"Suma media é: "+media);

    }//fecha metodo
}//fecha clase