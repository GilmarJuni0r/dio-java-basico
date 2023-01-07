import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
	
    System.out.println("Valor de mercado do produto:");
    int M = input.nextInt();
    System.out.println("Valor pago no produto:");
    int S = input.nextInt();
    double aux = ((double)S/(double)M)*100;
    int percentualDesconto = 100-((int)aux);
    
    System.out.println("O desconto foi de "+ percentualDesconto +"%");
    }
}
/*Desafio
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! 
A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 

Entrada
A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber
 o valor marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.

Saída
A saída deverá retornar o percentual de desconto que foi aplicado no produto */