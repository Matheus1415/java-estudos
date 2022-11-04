import java.util.Scanner;
public class Codego3 {
    public static void main(String[] args) {
        
        //variavel
        int anoatual, dNacimento, idade;
        //entrada
        Scanner entrada;
        entrada= new Scanner(System.in);
        System.out.println("digite o ano atual");
        anoatual=entrada.nextInt();
        System.out.println("digite o ano que voçê nasceu");
        dNacimento=entrada.nextInt();
        //processamento
        
        idade=anoatual - dNacimento;
        
        //saida
        
        System.out.println("SUA IDADE É: "+idade);
        
    }//fim do meu metodop
  
}//fim da classe
