import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opc=0;

        do{
            System.out.println("----- App -----"+
                                "\n1 - Calculadora"+
                                "\n2 - Mensagem"+
                                "\n3 - Emprestimo");
            opc = scanner.nextInt();
            
            if(opc <= 0 || opc > 3){
                System.out.println("Opção inválida, tente novamente");
                opc=0;
            }

        }while(opc==0);

        switch(opc){
            case 1:
                System.out.println("Digite um número:");
                int x = scanner.nextInt();
                System.out.println("Digite mais um número:");
                int y = scanner.nextInt();

                System.out.println(Calculadora.adicao(x, y));
                System.out.println(Calculadora.subtracao(x, y));
                System.out.println(Calculadora.multiplicacao(x, y));
                System.out.println(Calculadora.divisao(x, y));
                
            break;
            case 2:
                System.out.println("Digite a hora:");
                int hora = scanner.nextInt();
                System.out.println(Mensagem.exibirMensagem(hora));
            break;
            case 3:                               
                System.out.println("Digite o valor do emprestimo:");
                double valor = scanner.nextDouble();
                System.out.println("Digite a quantidade de parcelas:");
                int parcelas = scanner.nextInt();

                System.out.println("Valor total do emprestimo = R$"+Emprestimo.calculaEmprestimoTotal(valor, parcelas));
            break;
        }
    }
}
