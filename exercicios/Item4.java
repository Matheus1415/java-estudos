import java.util.Scanner;
public class Item4 {
    public static void main(String[] args) {
        //variavel
     String nome="";
     String sexo="";
     int idade ;
     float altura;
     
     Scanner entrada;
     entrada = new Scanner(System.in);       
  
       //nome   
             
        System.out.println("escreva seu nome");
         nome = entrada.next();
         
        System.out.println("escreva seu sexo :");
        sexo= entrada.next();
        
        System.out.println("escreva o nome da sua idade");
        idade = entrada.nextInt();
        
        System.out.println("escreva sua altura");
        altura = entrada.nextFloat();

        //saida
        
        System.out.println("seu nome é :"+nome);
        System.out.println("sua idade é :"+idade);
        System.out.println("sua altura é :"+altura);
        System.out.println("seu sexo é :"+sexo);
        
    }//Fecha psvm
    
}//Fecha class
