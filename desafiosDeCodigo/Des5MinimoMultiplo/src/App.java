import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
    
        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
          minimoMultiplo = numero;
        } else {
          minimoMultiplo = numero * 2;
        }
    
        System.out.println("O resultado é:" + minimoMultiplo);
    }
}
/*Descrição
Dado um inteiro positivo n, retorne o menor inteiro positivo que é um múltiplo 2 e de n .

Entrada
A entrada consiste em um int, do qual podemos calcular seu menor multiplo.

Saída
A saída consiste em um retorno, que será o menor multiplo do numero digitado e 2. */