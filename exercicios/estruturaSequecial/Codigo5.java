package estruturaSequencial;
import java.util.Scanner;
/**
 *
 * @author infor2022
 */
public class Codigo5 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        String nome; float salario, totvendas, salariofinal, comissao;
        System.out.println("Digite o nome do vendedor:");
        nome = entrada.nextLine();
        System.out.println("digite o total de vendas:");
        totvendas = entrada.nextInt();
        System.out.println("digite o salario:");
        salario = entrada.nextFloat();
        comissao = (float)(totvendas/100)*15;
        salariofinal = (float)salario + comissao;
        System.out.println("Nome:"+nome);       
        System.out.println("Salário fixo:"+salario+"reais");
        System.out.println("Salário final:"+salariofinal+"reais");
    }//fim psvm
}//fim codigo
